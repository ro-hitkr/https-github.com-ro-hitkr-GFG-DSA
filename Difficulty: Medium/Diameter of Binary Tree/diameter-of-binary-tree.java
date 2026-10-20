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
    static class Info{
        int dia;
        int ht;
        public Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }
    public Info diameterr(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftinfo = diameterr(root.left);
        Info rightinfo = diameterr(root.right);
        
        int diam = Math.max(Math.max(leftinfo.dia,rightinfo.dia),leftinfo.ht+rightinfo.ht);
        int ht = Math.max(leftinfo.ht,rightinfo.ht)+1;
        
        return new Info(diam,ht);
    }
    public int diameter(Node root) {
        // code here
        if (root == null) {
                    return 0;
                }
                return diameterr(root).dia;
    }
}