package JavaDSA.DoublyLinkedList.DeletionInDLL;

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
        
        int k = 4;
        // point the pointer at the kth position
        Node tempPointer = head;
        int counter = 0;
        while(tempPointer != null){
            counter++;
            if(counter == k){
                break;
            }
            tempPointer = tempPointer.next;
        }
        // find kth node's front and back
        Node fwdNode = tempPointer.next;
        Node bwdNode = tempPointer.back;
        // if single node DLL
        if(fwdNode == null && bwdNode == null){
            tempPointer = null;
        } else
        // if kth node is tail
        if(fwdNode == null){
            bwdNode.next = null;
            tempPointer.back = null;
        } else
        // if kth node is head
        if(bwdNode == null){
            fwdNode.back = null;
            head = tempPointer.next;
            tempPointer.next = null; 
        } 
        // if kth nod is in btn of the DLL head and tail
        else {
            bwdNode.next = fwdNode;
            tempPointer.next = null;
            fwdNode.back = bwdNode;
            tempPointer.back = null;
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
