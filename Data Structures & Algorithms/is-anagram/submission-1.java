class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }



        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);

            if(freqMap.containsKey(ch) == false){
                return false;
            }else if(freqMap.get(ch) == 1){
                freqMap.remove(ch);
            }else{
                freqMap.put(ch , freqMap.get(ch) - 1);
            }
        }

        return freqMap.size() == 0;
    }
}
