class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // code here
      if(k==1){
          return arr[0];
      }
      HashMap<Integer, Integer> hm = new HashMap<>();
      for(int i=0;i<arr.length;i++){
          int currcount = hm.getOrDefault(arr[i],0)+1;
          
          hm.put(arr[i], currcount);
          
          if(currcount == k){
              return arr[i];
          }
      }
      return -1;
    }
}