class Solution {
    public int coin(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        return arr[0];
    }
}