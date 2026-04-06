class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,List<String>> gMap = new HashMap<>();

        for(String str : strs){
            HashMap<Character,Integer> freqMap = new HashMap<>();

            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
            }
                if(gMap.containsKey(freqMap) == false){
                    List<String> list = new ArrayList<>();
                    list.add(str);
                    gMap.put(freqMap,list);
                }else{
                    List<String> list = gMap.get(freqMap);
                    list.add(str);
                }

        }
            

            List<List<String>> result = new ArrayList<>();

            for(List<String> val: gMap.values()){
                result.add(val);
            }

            return result;
        }   
    }

