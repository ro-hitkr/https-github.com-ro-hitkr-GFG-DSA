class Solution {
    int replaceBit(int n, int k) {
        // code here
        int tb = Integer.toBinaryString(n).length();
        
        if(k>tb && tb <= 0){
            return n;
        }
        
        int d = tb - k;
        int bm = ~(1<<d);
        return n & bm;
     
       
    
            
        
    }
}