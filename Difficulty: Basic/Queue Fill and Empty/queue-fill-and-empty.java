class Solution {
    public Queue<Integer> fillQ(int[] arr) {
        // code here
        Queue<Integer> q = new LinkedList<>();
        
        
            for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
            
        }
        return q;
    }

    public void emptyQ(Queue<Integer> q) {
        
        // code here
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
        System.out.println();
        
    }
}