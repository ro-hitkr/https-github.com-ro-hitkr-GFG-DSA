class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while(idx < S.length()){
            st.push(S.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!st.isEmpty()){
            char curr = st.pop();
            result.append(curr);
        }
        return result.toString();
        
    }
}