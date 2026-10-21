/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public static boolean isIdenticall(Node r1, Node r2){
        if(r1 == null && r2 == null){
            return true;
        }
        else if(r1 == null || r2 == null || r1.data != r2.data){
            return false;
        }
        if(!isIdenticall(r1.left, r2.left)){
            return false;
        }
        if(!isIdenticall(r1.right,r2.right)){
            return false;
        }
        return true;
    }
    public boolean isIdentical(Node r1, Node r2) {
        // code here
        if(r1 == null){
            return false;
        }
        if(r1.data == r2.data){
            if(isIdenticall(r1,r2)){
                return true;
            }
        }
        
        return isIdentical(r1.left,r2) || isIdentical(r1.right,r2);
    }
}