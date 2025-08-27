package DoublyLinkedList.DeletionInDLL;

public class KthNodeDeletion {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
       
        Node head = new Node(arr[0]);
        Node moveableHead = head;

        for(int i = 1; i < arr.length; i++){
            Node unlinkedNode = new Node(arr[i], null, moveableHead);
            moveableHead.next = unlinkedNode;
            moveableHead = unlinkedNode;
        }

        // delete kth node
        int k = 2;
        Node deletableNode = head;
        if(deletableNode == null){
            System.out.println("Doubly linked List is empty");
        } else if(deletableNode.next == null){
            // single node in the DLL hence delete this node 
            deletableNode = null;
        } else {
            int counter = 0;
            while(deletableNode != null){
                counter++;
                if(counter == k){
                    break;
                }
                deletableNode = deletableNode.next;
            }

            if(k == 1){
                Node nextNode = deletableNode.next;
                deletableNode.next = null;
                nextNode.back = null;
                head = nextNode;

            } else if( k == counter)
        }
    }

    public static class Node{
        int data;
        Node next;
        Node back;

        Node(int data){
            this.data= data;
            this.back = null;
            this.next = null;
        }
        
        Node(int data, Node next, Node back){
            this.data= data;
            this.back = back;
            this.next = next;
        }
    }
}
