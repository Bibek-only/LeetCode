import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar == '(' || currentChar == '{' || currentChar == '['){
                st.push(currentChar);
            }else{
                if(st.isEmpty()){
                    return false;
                }else if(
                    currentChar == ')' && st.peek() != '(' ||
                    currentChar == '}' && st.peek() != '{' ||
                    currentChar == ']' && st.peek() != '['
                ){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}