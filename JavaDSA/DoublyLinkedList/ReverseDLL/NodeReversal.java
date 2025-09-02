package JavaDSA.DoublyLinkedList.ReverseDLL;

public class NodeReversal {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Node head = new Node(arr[0]);
        Node moveableHead = head;
        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i], null, moveableHead);
            moveableHead.next = newNode;
            moveableHead = moveableHead.next;
        }

        //print the Doubly linked list before reversal
        Node printNode = head;
        System.out.println("DLL before reversal:");
        while(printNode != null){
            System.out.println("data- " + printNode.data + 
                "   back- " + (printNode.back == null ? "null" : printNode.back.data) +
                "   next- " + (printNode.next == null ? "null" : printNode.next.data) 
                );
            printNode = printNode.next;
        }

        // reverse the node
        Node tempPointer = head;
        while(tempPointer != null){
            Node tempNext = tempPointer.next;
            tempPointer.next = tempPointer.back;
            tempPointer.back = tempNext;
            // System.out.println(tempPointer.back == null);
            tempPointer = tempPointer.back;
        }
        // head = tempPointer;

        //print the Doubly linked list after reversal
        printNode = head;
        System.out.println("\nDLL after reversal:");
        while(printNode != null){
            System.out.println("data- " + printNode.data + 
                "   back- " + (printNode.back == null ? "null" : printNode.back.data) +
                "   next- " + (printNode.next == null ? "null" : printNode.next.data) 
                );
            printNode = printNode.back;
        }
    }

    public static class Node{
        int data;
        Node next;
        Node back;

        Node(int data){
            this.data = data;
            this.back = null;
            this.next = null;
        }

        Node(int data, Node next, Node back){
            this.data = data;
            this.back = back;
            this.next = next;
        }
    }
}
