package JavaDSA.DoublyLinkedList.insertionOfNode;

public class BeforeHead {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        Node head = new Node(arr[0]);
        Node moveableHead = head;
        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i], moveableHead, null);
            moveableHead.next = newNode;
            moveableHead = newNode;
        }

        //insert a new node before head
        Node tempHeadNode = head;
        Node insertableNode = new Node(100, null, tempHeadNode);
        tempHeadNode.back = insertableNode;
        head = insertableNode;

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
