// most basic way to reverse is to take the data if the each node and reverse it 
// use an stack to store the data of the node and pop it out for every node

package JavaDSA.DoublyLinkedList.ReverseDLL;

import java.util.Stack;

public class DataReverseDLL {
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

        // reverse using stack and data of node
        Stack<Integer> st = new Stack<>();
        Node tempPointer = head;
        while(tempPointer != null){
            st.push(tempPointer.data);
            tempPointer = tempPointer.next;
        }
        
        System.out.println();
        
        tempPointer = head;
        while(tempPointer != null){
            tempPointer.data = st.pop();
            tempPointer = tempPointer.next;
        }
        
        //print the Doubly linked list after reversal
        printNode = head;
        System.out.println("DLL after reversal:");
        while(printNode != null){
            System.out.println("data- " + printNode.data + 
                "   back- " + (printNode.back == null ? "null" : printNode.back.data) +
                "   next- " + (printNode.next == null ? "null" : printNode.next.data) 
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
