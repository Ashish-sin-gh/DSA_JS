package JavaDSA.DoublyLinkedList;

public class ArrayIntoDLL {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        Node head = new Node(arr[0]);
        Node moveableHeader = head;

        for(int i = 1; i < arr.length; i++){
            Node unlikedNode = new Node(arr[i]);

            moveableHeader.next = unlikedNode;
            unlikedNode.back = moveableHeader;
            moveableHeader = unlikedNode;
        }

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

        public Node(int data){
            this.data = data;
            this.next = null;
            this.back = null;
        }

        public Node(int data, Node next, Node back){
            this.data = data;
            this. next = next;
            this.back = back;
        }
    }
}
