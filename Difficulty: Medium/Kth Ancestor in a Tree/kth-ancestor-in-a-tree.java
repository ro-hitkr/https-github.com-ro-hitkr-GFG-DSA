/* Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    int ans = -1;
    public int kthAncestor(Node root, int k, int node) {
        // code here
        ans = -1;
        solve(root,k,node);
        return ans;
    }
      private int solve(Node root, int k, int node){
            if(root == null){
            return -1;
        }
        if(root.data==node){
            return 0;
        }
        int ldist = solve(root.left,k,node);
        int rdist = solve(root.right,k,node);
        
        if(ldist == -1 && rdist == -1){
            return -1;
        }
        int max = Math.max(ldist,rdist);
        if(max+1 == k){
            ans=  root.data;
        }
        return max+1;
      
    }
}