class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = createGraph(edges,n);

        boolean[] visited = new boolean[n];

        int components = 0;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,graph,visited);
                components++;
            }
        }
        return components;

    }

    private ArrayList<ArrayList<Integer>> createGraph(int[][] edges , int n){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);

        }

        return graph;
    }

    private void dfs(int node, ArrayList<ArrayList<Integer>> graph,boolean[] visited){
            visited[node] = true;

          for(int neighbour : graph.get(node)){
                if(!visited[neighbour]){
                    dfs(neighbour,graph,visited);
                }
          }
    }
}
