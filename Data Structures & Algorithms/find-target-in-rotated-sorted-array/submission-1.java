class Solution {
    public int search(int[] nums, int target) {
        int minEleIdx = findMinEleIndex(nums);
        int firstHalf = helperBS(nums,0,minEleIdx - 1,target);
        int secondHalf = helperBS(nums,minEleIdx,nums.length-1,target);

        if(firstHalf == -1) return secondHalf;

        return firstHalf;

    }

    private int findMinEleIndex(int[] nums){
        int n = nums.length;
        int start = 0;
        int end = nums.length - 1;

        if(start == end) return start;

        if(nums[start] <= nums[end]) return start;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if(nums[mid] <= nums[prev] && nums[mid] <= nums[next]){
                return mid;
            }else if(nums[0] <= nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

    private int helperBS(int[] nums,int start,int end,int target){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
