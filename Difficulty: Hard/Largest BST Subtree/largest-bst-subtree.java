/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    public Node(int d) {
     data = d;
     left = right = null;
   }
} */

class Solution {
    static class info{
        boolean isBST;
        int size;
        int min;
        int max;
        
        info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public int largestBst(Node root) {
        // code here
        maxBST = 0;
        largestBST(root);
        return maxBST;
    }
    
    public static int maxBST  = 0;
    
    public static info largestBST(Node root){
        if(root == null){
            return new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        info leftInfo = largestBST(root.left);
        info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size+1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        
        if(root.data<=leftInfo.max || root.data >= rightInfo.min || !leftInfo.isBST || !rightInfo.isBST){
            return new info(false, size, min,max);
        }
      
           maxBST = Math.max(maxBST, size);
          
        return new info(true, size,min,max);
    }
}