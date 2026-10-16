/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        inorderh(root, a);
        return a;
    }
        private void inorderh( Node root,ArrayList<Integer> a){
        if(root == null){
            return;
        }
       inorderh(root.left, a);
        a.add(root.data);
        inorderh(root.right,a);
    }
}