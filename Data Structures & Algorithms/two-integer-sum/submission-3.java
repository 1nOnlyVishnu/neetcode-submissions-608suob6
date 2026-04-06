

class Solution {

    class Pair implements Comparable<Pair> {
        int val;
        int idx;

        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.val, o.val);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Pair[] pairs = new Pair[nums.length];

        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new Pair(nums[i], i);
        }

        Arrays.sort(pairs);

        int li = 0;
        int ri = pairs.length - 1;

        while (li < ri) {
            int sum = pairs[li].val + pairs[ri].val;

            if (sum < target) {
                li++;
            } else if (sum > target) {
                ri--;
            } else {
                int i1 = pairs[li].idx;
                int i2 = pairs[ri].idx;

                // return indices in increasing order
                return new int[] { Math.min(i1, i2), Math.max(i1, i2) };
            }
        }

        return new int[0]; // guaranteed solution, unreachable
    }
}
