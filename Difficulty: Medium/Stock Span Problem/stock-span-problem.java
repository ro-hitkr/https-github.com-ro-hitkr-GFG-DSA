class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        int span[] = new int[arr.length];
        span[0] = 1;
        s.push(0);
        
        for(int i=0;i<arr.length;i++){
            int currPrice = arr[i];
            while(!s.isEmpty() && currPrice>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
               for (int x : span) {
                   result.add(x);
               }

               return result;
    }
}