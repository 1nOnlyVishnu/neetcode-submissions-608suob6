class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> freqMap = new HashMap<>();

        if(s.length() == 0) return 0;
        if(s == null) return 0;

        int left = 0;
        int result = 1;
        int maxFreq = 0;

        for(int right = 0;right< s.length() ;right++){
            char ch = s.charAt(right);

            freqMap.put(ch, freqMap.getOrDefault(ch,0) + 1);

            maxFreq = Math.max(maxFreq, freqMap.get(ch));

            // current window size = right - left + 1;
            // if this window size > k , there can be no replacements , so shrink window

            if((right - left + 1) - maxFreq > k){
                char leftChar = s.charAt(left);
                freqMap.put(leftChar,freqMap.get(leftChar) - 1);
                left += 1;

            }

            result = Math.max(result, right - left + 1);

        }

        return result;


    }
}
