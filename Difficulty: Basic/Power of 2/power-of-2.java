class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
       if(n == 1 ){
           return true;
       }
        return n > 0 && (n & (n - 1)) == 0;
    }
}