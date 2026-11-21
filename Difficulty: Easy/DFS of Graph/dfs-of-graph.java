class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
      ArrayList<Integer> ans = new ArrayList<>();
        
        int n = adj.size();
        
        boolean visit[] = new boolean[n];
        
        dfss(0,adj,visit,ans);
        return ans;
        
    }
    private void dfss(int curr,ArrayList<ArrayList<Integer>> adj, boolean[] visit,  ArrayList<Integer> ans){
        visit[curr] = true;
        ans.add(curr);
        
        for(int i=0;i<adj.get(curr).size();i++){
            int neigh = adj.get(curr).get(i);
            if(!visit[neigh]){
                dfss(neigh,adj,visit,ans);
            }
        }
    }
}