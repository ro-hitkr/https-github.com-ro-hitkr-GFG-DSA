class Solution {
    public String longest(String[] arr) {
        // code here
        if (arr == null || arr.length == 0) {
                  return "";
              }
        String str = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>str.length()){
                str = arr[i];
            }}
            return str;
        }
}