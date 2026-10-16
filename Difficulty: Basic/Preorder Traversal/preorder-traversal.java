/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }
     
     public void preorder(Node root, ArrayList<Integer> result){
         if(root == null){
             return;
         }
         result.add(root.data);
         preorder(root.left, result);
         preorder(root.right,result);
     }   
    
}