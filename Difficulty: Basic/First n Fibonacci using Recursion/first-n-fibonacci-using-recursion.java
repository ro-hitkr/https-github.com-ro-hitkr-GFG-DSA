class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        // code here
  ArrayList<Integer> ans = new ArrayList<>();
        if (n <= 0) return ans;

        int f1 = 0, f2 = 1;
        ans.add(f1);

        for (int i = 1; i < n; i++) {
            ans.add(f2);
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        return ans;
    }
}