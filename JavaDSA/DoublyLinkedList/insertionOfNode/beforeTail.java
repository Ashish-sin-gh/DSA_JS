package JavaDSA.DoublyLinkedList.insertionOfNode;

public class beforeTail {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        Node head = new Node(arr[0]);
        Node moveableHead = head;
        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i], moveableHead, null);
            moveableHead.next = newNode;
            moveableHead = newNode;
        }

        // insert before the tail
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        if(currentNode.next == null){
            // DLL has one node only - treat it as head of the DLL
            Node newNode = new Node(100, null, currentNode);
            currentNode.back = newNode;
            head = newNode;
        } else{
            Node bwdNode = currentNode.back;
            Node newNode = new Node(100, bwdNode, currentNode);
            bwdNode.next = newNode;
            currentNode.back = newNode;
        }
        
        //print the Doubly linked list
        Node printNode = head;
        while(printNode != null){
            System.out.println("data- " + printNode.data + 
                "   back- " + (printNode.back == null ? "null" : printNode.back.data) +
                "   next- " + (printNode.next == null ? "null" : printNode.next.data) 
                );
            printNode = printNode.next;
        }
    }

    public static class Node {
        int data;
        Node back;
        Node next;

        Node(int data){
            this.data = data;
            this.back = null;
            this.next = null;
        }

        Node(int data, Node back, Node next){
            this.data = data;
            this.back = back;
            this.next = next;
        }
    }
}
