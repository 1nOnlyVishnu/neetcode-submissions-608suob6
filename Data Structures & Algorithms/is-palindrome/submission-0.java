class Solution {
    public boolean isPalindrome(String s) {
        
        String str = "";

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                str += ch;
            }
        }

        str = str.toLowerCase();

        int a_pointer = 0;
        int b_pointer = str.length() - 1;

        while(a_pointer <= b_pointer){
            if(str.charAt(a_pointer) != str.charAt(b_pointer)){
                return false;
            }
            a_pointer++;
            b_pointer--;
        }

        return true;
    }
}
