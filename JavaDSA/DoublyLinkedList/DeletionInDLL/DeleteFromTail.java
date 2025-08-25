package JavaDSA.DoublyLinkedList.DeletionInDLL;

public class DeleteFromTail {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        Node head = new Node(arr[0]);
        Node moveableHead = head;
        for(int i = 1; i < arr.length; i++){
            Node unlikedNode = new Node(arr[i], null, moveableHead);
            moveableHead.next = unlikedNode;
            moveableHead = unlikedNode;
        }

        // remove from tail
        if(head == null){
            System.out.println("empty doubly linked list");
        } else if (head.next == null){
            head = null;
        } else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            Node prev = last.back;
            prev.next = null;
            last.back = null;
        }

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

        Node(int data){
            this.data = data;
            this.next =  null; 
            this.back =  null; 
        }
        
        Node(int data, Node next, Node back){
            this.data = data;
            this.next =  next; 
            this.back =  back; 
        }
    }
}
