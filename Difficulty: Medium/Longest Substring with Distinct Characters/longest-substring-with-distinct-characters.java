class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int ans= 0, n=s.length(), fp = 0, sp = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while(sp<n){
            addtoMap(hm, s.charAt(sp));
            while(fp<sp && !isValid(hm)){
                deletefrommap(hm, s.charAt(fp));
                fp++;
            }
            int length = sp - fp + 1;
            ans = Math.max(ans, length);
            sp++;
        }
        return ans;
    }
    public void addtoMap(HashMap<Character, Integer> hm, char c){
        hm.put(c, hm.getOrDefault(c, 0)+1);
    }
    public void deletefrommap(HashMap<Character, Integer> hm, char c){
        hm.put(c, hm.get(c)-1);
    }
    public boolean isValid(HashMap<Character, Integer> hm){
        for(char ch:hm.keySet()){
            if(hm.get(ch)>1){
                return false;
            }
            
        }   
        return true;
        }
}