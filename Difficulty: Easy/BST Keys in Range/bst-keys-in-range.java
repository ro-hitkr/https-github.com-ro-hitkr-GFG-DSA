/* Structure of BST tree Node
class Node {
    public int data;
    public Node left;
    public Node right;
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/
class Solution {
    public ArrayList<Integer> nodesInRange(Node root, int low, int high) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
       helper(root,low,high,result);
       return result;
        }
       
    private void helper(Node root, int low, int high, ArrayList<Integer> result){
           if(root == null){
               return;
           }
           if(root.data > low){
               helper(root.left, low, high, result);
           }
           if(root.data >= low && root.data <= high){
               result.add(root.data);
           }
           if(root.data<high){
                helper(root.right, low, high, result);
           }
           
       }
}