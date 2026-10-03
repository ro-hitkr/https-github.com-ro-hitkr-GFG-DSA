class Solution {
    public void solve(Stack<Integer> s, int size, int curr){
            if(curr == size/2){
                s.pop();
                return;
            }
            int topelement = s.pop();
            solve(s,size,curr+1);
            s.push(topelement);
        }
    
    public void deleteMid(Stack<Integer> s) {
        // code here
        solve(s,s.size(),0);
    }
}