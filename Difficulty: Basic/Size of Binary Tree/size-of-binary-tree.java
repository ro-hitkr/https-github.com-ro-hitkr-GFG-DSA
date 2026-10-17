/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int getSize(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        
        int lh = getSize(root.left);
        int rh = getSize(root.right);
        return (lh+rh)+1;
    }
}