class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        // code here
    ArrayList<Integer> result = new ArrayList<>();
  if(n<=0){
      return result;
  }
    result.add(0);
    if(n==1){
        return result;
    }
    result.add(1);
    for(int i = 2;i<n;i++){
        int next = result.get(i-1) + result.get(i-2);
        result.add(next);
    }
    return result;
      }
}