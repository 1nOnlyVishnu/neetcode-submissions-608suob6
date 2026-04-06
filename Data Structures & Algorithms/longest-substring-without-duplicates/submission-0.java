class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> strSet = new HashSet<>();

        if(s.length() == 0) return 0;
        if(s == null) return 0;

        int l = 0;
        int r = 0;
        int longest = 0;

        while(r<s.length()){
            char ch = s.charAt(r);
            while(strSet.contains(ch)){
                strSet.remove(s.charAt(l));
                l += 1;
            }
            strSet.add(ch);
            longest = Math.max(longest, r - l + 1);
            r += 1;
        }

        return longest;
    }
}
