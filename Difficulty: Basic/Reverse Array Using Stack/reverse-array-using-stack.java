class Solution {
    public void reverseArray(int[] arr) {
        // code here
     Stack<Integer> st = new Stack<>();
     
     for(int i=0;i<arr.length;i++){
         st.push(arr[i]);
     }
     int idx = 0;
     while(!st.isEmpty()){
         arr[idx] = st.pop();
         idx++;
     }
    }
}
