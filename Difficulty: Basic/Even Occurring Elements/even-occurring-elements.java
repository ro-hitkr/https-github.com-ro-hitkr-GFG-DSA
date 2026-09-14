import java.util.*;

class Solution {
    public ArrayList<Integer> findEvenOccurrences(int[] arr) {
        // code here
       ArrayList<Integer> result = new ArrayList<>();
               int n = arr.length;
               if (n == 0) {
                   result.add(-1);
                   return result;
               }

               // Step 1: Clone and sort the array
               int[] sortedArr = arr.clone();
               Arrays.sort(sortedArr);

               // Step 2: Identify even-occurring elements
               ArrayList<Integer> evenElements = new ArrayList<>();
               int currentCount = 1;

               for (int i = 1; i < n; i++) {
                   if (sortedArr[i] == sortedArr[i - 1]) {
                       currentCount++;
                   } else {
                       if (currentCount % 2 == 0) {
                           evenElements.add(sortedArr[i - 1]);
                       }
                       currentCount = 1;
                   }
               }
               // Handle the last element group
               if (currentCount % 2 == 0) {
                   evenElements.add(sortedArr[n - 1]);
               }

               // Step 3: Match with the original array to preserve order
               for (int x : arr) {
                   // Check if it's an even-occurring element (using Integer object wrapper to remove)
                   if (evenElements.contains(x)) {
                       result.add(x);
                       evenElements.remove((Integer) x); // Remove to prevent duplicates
                   }
               }

               if (result.isEmpty()) {
                   result.add(-1);
               }
               return result;
           }
       }