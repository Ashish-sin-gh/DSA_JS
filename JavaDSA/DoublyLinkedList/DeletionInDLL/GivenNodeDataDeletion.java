// given node can never be head - 

package JavaDSA.DoublyLinkedList.DeletionInDLL;

public class GivenNodeDataDeletion {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
       
        Node head = new Node(arr[0]);
        Node moveableHead = head;

        for(int i = 1; i < arr.length; i++){
            Node unlinkedNode = new Node(arr[i], null, moveableHead);
            moveableHead.next = unlinkedNode;
            moveableHead = unlinkedNode;
        }
        
        int key = 10;
        // point the pointer to given node
        Node tempPointer = head;
        while(tempPointer != null){
            if(tempPointer.data == key){
                break;
            }
            tempPointer = tempPointer.next;
        }
        // find front and back node give node
        Node fwdNode = tempPointer.next;
        Node bwdNode = tempPointer.back;
        // if single node in DLL
        if(fwdNode == null && bwdNode == null){
            tempPointer = null;
        } else
        // if tail node 
        if(fwdNode == null){
            bwdNode.next = null;
            tempPointer.back = null;
        } else 
        // if head node
        if(bwdNode == null){
            head = fwdNode;
            tempPointer.next = null;
            fwdNode.back = null;
        }
        // if in btn node
        if(fwdNode != null && bwdNode != null){
            bwdNode.next = fwdNode;
            fwdNode.back = bwdNode;
            tempPointer.next = tempPointer.back = null;
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
        Node back;
        Node next;

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
