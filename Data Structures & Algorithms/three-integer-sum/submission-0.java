
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        // Use a HashSet to avoid duplicate triplets
        Set<List<Integer>> triplets = new HashSet<>();

        // Iterate through all possible triplets
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet =
                                Arrays.asList(nums[i], nums[j], nums[k]);

                        // Sort to ensure uniqueness
                        Collections.sort(triplet);

                        triplets.add(triplet);
                    }
                }
            }
        }

        // Convert set to list
        return new ArrayList<>(triplets);
    }
}
