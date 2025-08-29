package JavaDSA.DoublyLinkedList.insertionOfNode;

public class BeforeKthNode {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        Node head = new Node(arr[0]);
        Node moveableHead = head;
        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i], moveableHead, null);
            moveableHead.next = newNode;
            moveableHead = newNode;
        }

        // pointer to kth node 
        int k = 1;
        Node tempNode = head;
        int counter = 0;
        Node newNode = new Node(100);
        if(tempNode == null){
            head = newNode;
        } 
        else {
            while(tempNode != null){
            counter++;
            if(counter == k){
                break;
            }
            tempNode = tempNode.next;
            }
            // get front and back nodes
            Node fwdNode = tempNode.next;
            Node bwdNode = tempNode.back;
            // if single node 
            // if head node
            if( (fwdNode == null && bwdNode == null) || (bwdNode == null)){
                newNode.next = tempNode;
                tempNode.back = newNode;
                head = newNode;
            } else {
            // if tail node
            // if in btn node
                newNode.next = tempNode;
                bwdNode.next = newNode;
                tempNode.back = newNode;
                newNode.back = bwdNode;
            }
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
