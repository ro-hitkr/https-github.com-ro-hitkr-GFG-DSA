/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    public Node sortedArrayToBST(int[] arr) {
        // code here
        return insert(arr, 0, arr.length-1);
    }
    public Node insert(int arr[], int left, int right){
        if(left > right){
           
            return null;
        }
        
        int mid = left+(right-left)/2;
        Node root = new Node(arr[mid]);
        
            root.left = insert(arr, left,mid-1);
      
            root.right = insert(arr,mid+1,right);
            return root;
    }
}