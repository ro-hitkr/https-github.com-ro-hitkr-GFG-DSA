class Solution {
    public ArrayList<Integer> findIntersection(int[] a, int[] b) {
        // code here
        HashSet<Integer> hm = new HashSet<>();
        
        for(int i=0;i<b.length;i++){
            hm.add(b[i]);
        }
        
       LinkedHashSet<Integer> arr = new LinkedHashSet<>();
        for(int i=0;i<a.length;i++){
            if(hm.contains(a[i])){
                arr.add(a[i]);
            }
        }
       
        return new ArrayList<>(arr);

    }
}