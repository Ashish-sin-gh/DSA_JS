package JavaDSA.DoublyLinkedList.oddEventLL;

import java.util.ArrayList;
import java.util.List;

public class UsingSameLL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);

        // main code
        Node oddPt = head;
        Node evenPt = head.next;
        Node evenPtstored = evenPt;
        while(evenPt != null && evenPt.next != null){   
            // time complexity - O(n) - even if while loop is going n/2 setps, there are 2 steps inside that is happening
            // space complixty - O(1)
            oddPt.next = oddPt.next.next;
            evenPt.next = evenPt.next.next;

            oddPt = oddPt.next;
            evenPt = evenPt.next;
        }
        oddPt.next = evenPtstored; 

        printLL(head);
    }

    public static void printLL(Node head){
        while(head != null){
            System.out.println("data- " + head.data + 
                "   next- " + (head.next == null ? "null" : head.next.data) 
                );
            head = head.next;
        }
    }

    public static void insertFromArray(int[] arr, Node head){
        // head = new Node(arr[0]);
        Node moveableHead = head;
        // intial = new Node(arr[0]);
        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i]);
            moveableHead.next = newNode;
            moveableHead = moveableHead.next;
        }
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
