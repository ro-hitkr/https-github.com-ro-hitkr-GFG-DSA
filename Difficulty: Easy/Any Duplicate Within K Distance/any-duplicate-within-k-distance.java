import java.util.HashSet;

class Solution {
    public boolean checkWithinK(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // If the element is already present in the set, a duplicate exists within distance k
            if (set.contains(arr[i])) {
                return true;
            }

            // Add current element to the set
            set.add(arr[i]);

            // Remove the element that is now more than k distance away from the current index
            if (i >= k) {
                set.remove(arr[i - k]);
            }
        }

        return false;
    }
}