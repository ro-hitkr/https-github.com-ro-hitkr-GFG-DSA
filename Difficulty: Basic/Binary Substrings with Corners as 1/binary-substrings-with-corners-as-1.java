class Solution {
    public int binarySubstring(String s) {
        // code here
       int totalSubstring=0;
        int count=0;
        
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='1'){
                count++;
            }
        }
        if(count<2){
            return 0;
        }
         return totalSubstring= (count * (count - 1)) / 2;
        
   
    }
}