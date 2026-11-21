class Solution {
    public ArrayList<ArrayList<Integer>> printGraph(int V, int edges[][]) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
            if(u!=v){
                adj.get(v).add(u);
            }
            
            
        }
        return adj;
    }
}