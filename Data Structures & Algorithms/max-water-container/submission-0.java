class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right  = heights.length - 1;
        int water = 0;

        int maxWater = 0;
        while(left < right){
            water = Math.min(heights[left] , heights[right]) * (right - left);
            maxWater = Math.max(maxWater,water);

            if(heights[left] <heights[right]){
                left++;
            }else if(heights[left] > heights[right]){
                right--;
            }else{
                left++;
                right--;
            }
        }

        return maxWater;
    }
}
