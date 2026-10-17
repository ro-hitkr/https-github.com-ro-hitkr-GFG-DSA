/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        postorder(root,result);
        return result;
    }
       public void postorder(Node root, ArrayList<Integer> result){
           if(root==null){
               return;
           }
            postorder(root.left, result);
            postorder(root.right,result);
            result.add(root.data);
            
        }
    
}