class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> s2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch== '{' || ch=='['){
                s2.push(ch);
            }else{
                if(s2.isEmpty()){
                    return false;
                }
                if((s2.peek() == '(' && ch == ')')||
                (s2.peek() == '{' && ch == '}')||
                (s2.peek() == '[' && ch == ']')){
                    s2.pop();
                }else{
                    return false;
                }
            }
            
        }
        return s2.isEmpty();
    }
}
