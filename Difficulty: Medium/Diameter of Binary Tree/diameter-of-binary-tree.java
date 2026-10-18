/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/


class Solution {
    public static int height(Node root){
    if(root == null){
        return 0;
    }
    int lh = height(root.left);
    int rh = height(root.right);
    return Math.max(lh,rh)+1;
}
    public int diameter(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftht = height(root.left);
        int rightDiam = diameter(root.right);
        int rightht = height(root.right);
        
        int selfDiam = leftht + rightht;
        
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }
}
