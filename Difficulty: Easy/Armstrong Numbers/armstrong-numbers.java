class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int rn = n;
        int sum = 0;
        while(n>0){
            int ld = n%10;
            sum += ld*ld*ld;
            n/=10;
        }
        return sum == rn;
    }
}