class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int result[] = new int[n];
        int insertpos = 0;
        for(int num : arr){
            if(num!=0){
                result[insertpos] = num;
                insertpos++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = result[i];
        }
    }
}