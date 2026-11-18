class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        HashSet<Integer> hm = new HashSet<>();

            for(int i=0;i<a.length;i++){
                hm.add(a[i]);
            }

           LinkedHashSet<Integer> arr = new LinkedHashSet<>();
            for(int i=0;i<b.length;i++){
                if(hm.contains(b[i])){
                    arr.add(b[i]);
                    hm.remove(b[i]);
                }
            }

            return new ArrayList<>(arr);
    }
}