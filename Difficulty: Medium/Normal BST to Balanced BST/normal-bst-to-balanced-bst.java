/* BST Node Structure
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/


class Solution {
    static Node balanceBST(Node root) {
        // code here.
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(root,inorder);
        
        root = createbst(inorder, 0 , inorder.size()-1);
        return root;
    }
    public static void getinorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
        
    }
    public static Node createbst( ArrayList<Integer> inorder, int st, int end){
        if(st>end){
            return null;
        }
    int mid = (st+end)/2;
    Node root = new Node(inorder.get(mid));
    root.left = createbst(inorder, st, mid-1);
    root.right = createbst(inorder, mid+1, end);
    return root;
    
    }
    public static void getpreorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data+ " ");
        getpreorder(root.left);
        getpreorder(root.right);
    }
}