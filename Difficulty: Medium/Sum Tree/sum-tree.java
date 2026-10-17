/* Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
     public boolean isSumTree(Node node) {
        // code here
        return helper(node)!=-1;
     }
        int helper(Node node){
        if(node == null){
            return 0;
        }
        
       if(node.left == null && node.right == null){
           return node.data;
       }
       int leftsum = helper(node.left);
       int rightsum = helper(node.right);
       
       //violation
       if(leftsum == -1 || rightsum == -1){
           return -1;
       }
       if(node.data == leftsum + rightsum){
           return node.data + leftsum + rightsum;
       }else{
           return -1;
       }
    }
}