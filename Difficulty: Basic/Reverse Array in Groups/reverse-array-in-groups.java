class Solution {
    public static void rev(int arr[], int st, int end){
       while(st<end){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
    
    public void reverseInGroups(int[] arr, int k) {
        // code here
       int n = arr.length;

               // Loop through the array, jumping forward by 'k' indexes each time
               for (int i = 0; i < n; i += k) {
                   int st = i; // The starting index of the current group

                   // The ending index is either (i + k - 1) OR the very last element (n - 1)
                   // Math.min prevents an ArrayIndexOutOfBoundsException on the last group
                   int end = Math.min(i + k - 1, n - 1);

                   // Reverse the current group block
                   rev(arr, st, end);
               }
        
    }
}