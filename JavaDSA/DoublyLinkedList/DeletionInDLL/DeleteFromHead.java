package JavaDSA.DoublyLinkedList.DeletionInDLL;

public class DeleteFromHead {
    public static void main(String[] args) {
        int[] arr = { 10,20,30,40,50,60 };
        
        // array to doubly linked list
        Node head = new Node(arr[0]);
        Node moveableHead = head;
        for(int i = 1; i < arr.length; i++){
            Node unlinkedNode = new Node(arr[i], null, moveableHead);
            moveableHead.next = unlinkedNode;
            moveableHead = unlinkedNode;
        }

        // delete from the head
        head = head.next;

        //print the Doubly linked list
        Node printNode = head;
        while(printNode != null){
            System.out.println("data- " + printNode.data + 
                "   next- " + (printNode.next == null ? "null" : printNode.next.data) + 
                "   back- " + (printNode.back == null ? "null" : printNode.back.data) 
                    );
            printNode = printNode.next;
        }


    }

    public static class Node{
        int data;
        Node next;
        Node back;

        public Node(int data, Node next, Node back){
            this.data = data;
            this.back = back;
            this.next = next;
        }

        public Node(int data){
            this.data = data;
            this.back = null;
            this.next = null;
        }
    }
}
