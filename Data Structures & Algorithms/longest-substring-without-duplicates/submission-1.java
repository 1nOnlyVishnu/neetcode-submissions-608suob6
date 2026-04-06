class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        if(s == null || s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int longest = 0;


        while(right < s.length()){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left += 1;
            }
            set.add(ch);
            longest = Math.max(longest , right - left + 1);
            right += 1;
        }


        return longest;
        
    }
}
