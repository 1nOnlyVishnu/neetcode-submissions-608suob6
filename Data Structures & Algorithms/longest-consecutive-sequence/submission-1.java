class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length == 0) return 0;

        // Arrays.sort(nums);

        // int count = 1;
        // int longest = 1;

        // for(int i=0;i<nums.length - 1;i++){
        //     if (nums[i] + 1 == nums[i + 1]) {
        //         count++;
        //         longest = Math.max(longest, count);
        //     } 
        //     else if (nums[i] == nums[i + 1]) {
        //         continue;
        //     } 
        //     else {
        //         count = 1;
        //     }
        // }

        // return longest;

        int longest = 0;

        int length = 0;

        Set<Integer> numSet = new HashSet<>();

        for(int num : nums){
            numSet.add(num);
        }

        for(int num : nums){
            //check if its start of the sequence
            if(!numSet.contains(num - 1)){
                length = 0;
                while(numSet.contains(num + length)){
                    length ++;
                }
                longest = Math.max(longest,length);
            }

        }
        return longest;
    }
}
