/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Node newNode = head;
        while(newNode != null){
            result.add(newNode.data);
            newNode = newNode.next;
        }
        
    return result;
    }
}