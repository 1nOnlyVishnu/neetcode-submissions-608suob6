class Solution {

    public int numIslands(char[][] grid) {
       
        Set<String> visited = new HashSet<>();
        int count = 0;


        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(explore(r,c,grid,visited)){
                    count += 1;
                }
            }
        }
        
        return count;
    }

    private boolean explore(int r,int c,char[][] grid,Set<String> visited){

        boolean rowInBounds = r >= 0 && r < grid.length;
        boolean colInBounds = c >= 0 && c < grid[0].length;

        if(!rowInBounds || !colInBounds) return false;

        if(grid[r][c] == '0') return false;


        String pos = r + "," + c;
        if(visited.contains(pos)) return false;

        visited.add(pos);

        explore(r-1,c,grid,visited);
        explore(r+1,c,grid,visited);
        explore(r,c-1,grid,visited);
        explore(r,c+1,grid,visited);

        return true;
    }
}
