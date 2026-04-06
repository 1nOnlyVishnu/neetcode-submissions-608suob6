class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();

        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for(char ch: s.toCharArray()){
            if(map.containsKey(ch)) {
                st.push(ch);
            }
            else{
                if(st.size() > 0 && map.get(st.peek()) == ch){
                    st.pop();
                }else{
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
