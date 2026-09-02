class Solution {
    public int maxWater(int arr[]) {
 int maxwate = 0;
 int left = 0;
 int right = arr.length-1;

 while(left<right){
     int h = (arr[left] < arr[right]) ? arr[left] : arr[right];
     int width = right - left;
     int currwater = h * width;

     if(currwater > maxwate){
         maxwate = currwater;
     }

     if(arr[left] < arr[right]){
         left++;
     }else
     {
         right--;
     }
 }
 return maxwate;
}
}