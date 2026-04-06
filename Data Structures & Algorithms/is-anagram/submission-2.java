class Solution {

        public static Map<Character,Integer> freqMapHelper(String word){
        Map<Character,Integer> freqMap = new HashMap<>();

        for(char ch : word.toCharArray()){
            freqMap.put(ch , freqMap.getOrDefault(ch,0)+1);
        }

        return freqMap;
    }
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> map1 = freqMapHelper(s);
        Map<Character,Integer> map2 = freqMapHelper(t);

        return map1.equals(map2);

        
    }

}
