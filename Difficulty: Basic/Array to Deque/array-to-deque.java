class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer> a = new ArrayDeque<>();
        for(int i=0;i<arr.size();i++){
            a.addLast(arr.get(i));
        }
        return a;
    }
}