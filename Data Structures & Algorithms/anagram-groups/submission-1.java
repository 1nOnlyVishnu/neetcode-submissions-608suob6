class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

            Map<String,List<String>> map = new HashMap<>();

            for(String word : strs){ //word variable contains the original string.
                //cat
                char[] words = word.toCharArray();
                // ["c","a","t"]

                Arrays.sort(words);
                //["a","c","t"]

                String key = new String(words); //"act"

                if(!map.containsKey(key)){
                    map.put(key, new ArrayList<>());
                }

                /*  

                key    values
                act -->[act , cat]
                aht -->[hat]
                stop -->[stop,pots,tops]
                */

                map.get(key).add(word);
            }

            return  new ArrayList<>(map.values());
    
        }
    
    }

