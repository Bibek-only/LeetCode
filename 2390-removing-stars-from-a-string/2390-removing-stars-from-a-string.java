class Solution {
    public String removeStars(String s) {
        char ch[] = s.toCharArray();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int len = ch.length;
        for(int i =0; i<len ; i++){
            if(ch[i] == '*'){
                if(!st.empty()){
                    st.pop();
                }
            }else{
                st.push(ch[i]);
            }
        }

        for(char c: st){
            sb.append(c);
        }

        return sb.toString();

    }
}