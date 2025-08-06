package linkedList.DeletionInLinkedList;

public class Delete1stElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        
        Node head = new Node(arr[0]);
        Node moveablePointer = head;

        for(int i = 1; i < arr.length; i++){
            Node unlinkedNextNode = new Node(arr[i]);
            moveablePointer.nextNode = unlinkedNextNode;
            moveablePointer = moveablePointer.nextNode; 
        }

        // delete first element 
        head = head.nextNode;

        System.out.println(head.data);

    }

    public static class Node{
        int data; 
        Node nextNode;

        Node(int element, Node referenceNextNode){
            this.data = element;
            this.nextNode = referenceNextNode;
        }

        Node(int element){
            this.data = element;
            this.nextNode = null;
        }
    }
}
