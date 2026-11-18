class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
       for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
             if(entry.getValue() > n/2){
                 return entry.getKey();
             }
         }
        return -1;
    }
}