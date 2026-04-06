class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int count = 1;
        int longest = 1;

        for(int i=0;i<nums.length - 1;i++){
            if (nums[i] + 1 == nums[i + 1]) {
                count++;
                longest = Math.max(longest, count);
            } 
            else if (nums[i] == nums[i + 1]) {
                continue;
            } 
            else {
                count = 1;
            }
        }

        return longest;
    }
}
