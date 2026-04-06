class Solution {

    public String encode(List<String> strs) {

        // ["Hello","Friend"]

        StringBuilder sb = new StringBuilder();

        for(String word : strs){
            //"Hello" 
            //"Friend"
            int length = word.length(); //5 //6
            String ch = "#"; //separator

            sb.append(length).append(ch).append(word);
            //"5#Hello6#Friend"
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int temp = i;
            while(str.charAt(temp) != '#'){
                temp++;
            }

            int length = Integer.parseInt(str.substring(i, temp));

            String word = str.substring(temp + 1, temp + 1 + length);
            result.add(word);

            
            i = temp + 1 + length;
        }
        return result;
    }
}
