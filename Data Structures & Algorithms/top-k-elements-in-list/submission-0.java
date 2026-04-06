class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        List<Integer> keys = new ArrayList<>(freqMap.keySet());
        List<Integer> values = new ArrayList<>(freqMap.values());

        int[] ans = new int[k];

        for(int i=0;i<k;i++){
            int maxVal = Collections.max(values);
            int index = values.indexOf(maxVal);

            int element = keys.get(index);

            ans[i] = element;

            values.remove(index);
            keys.remove(index);
        }

return ans;

    }
}
