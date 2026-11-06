/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public boolean isBST(Node root) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        if(root == null){
            return true;
        }
        helper(root,a);
        for(int i = 1;i<a.size();i++){
            if(a.get(i) <= a.get(i-1)){
                return false;
            }
        }
        return true;
        
    }
    public void helper(Node root, ArrayList<Integer> result){
        if(root == null){
            return;
        }
        helper(root.left, result);
        result.add(root.data);
        helper(root.right,result);
    }
}