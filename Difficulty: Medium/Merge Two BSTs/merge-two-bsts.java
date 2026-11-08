/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Integer> merge(Node r1, Node r2) {
        // code here
        ArrayList<Integer> arr1 = new ArrayList<>();
        inorder(r1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        inorder(r2, arr2);
        
        int i = 0,j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
            while(i<arr1.size()){
                finalArr.add(arr1.get(i));
                i++;
            }
            while(j<arr2.size()){
                finalArr.add(arr2.get(j));
                j++;
            }
        
        
     return finalArr;
        
    }
    public static void inorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static Node createBST(ArrayList<Integer> arr, int st, int end){
        if(st > end){
            return null;
        }
        
    int mid = (st+end)/2;
    Node root = new Node(arr.get(mid));
    root.left = createBST(arr, st, mid-1);
    root.right = createBST(arr, mid+1, end);
    return root;
    
    }
    
}