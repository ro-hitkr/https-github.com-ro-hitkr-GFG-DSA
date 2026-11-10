/* A Binary Tree node
class Node {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
*/

class Solution {
	boolean hasPathSum(Node root, int target) {
		// code here
		if(root == null){
		    return false;
		}
		
		if(root.left == null && root.right == null){
		   return root.data==target;
		}
		int remain = target - root.data;
		return hasPathSum(root.left, remain) || hasPathSum(root.right, remain);
	}
}
