class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = adj.size();
        if(n==0){
            return ans;
        }
        
        Queue<Integer> q = new LinkedList<>();
        boolean vist[] = new boolean[n];
        q.add(0);
        vist[0]= true;
        while(!q.isEmpty()){
            int curr = q.remove();
            ans.add(curr);
            
                for(int i=0;i<adj.get(curr).size();i++){
                    int neigh = adj.get(curr).get(i);  
                     if(!vist[neigh]){
                    vist[neigh] = true; 
                    q.add(neigh);
                }
            }
        }
        return ans;
    }
}