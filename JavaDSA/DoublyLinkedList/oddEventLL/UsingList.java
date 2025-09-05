// using a list to store the Nde data

package JavaDSA.DoublyLinkedList.oddEventLL;

import java.util.ArrayList;
import java.util.List;

public class UsingList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);

        List<Integer> list = new ArrayList<>();

        // main code
        // add odd index to list
        Node tempPt = head;
        while(tempPt != null && tempPt.next != null){
            list.add(tempPt.data);
            tempPt = tempPt.next.next;
        }
        if(tempPt != null) list.add(tempPt.data);
        
        // add even index to the list
        tempPt = head.next;
        while(tempPt != null && tempPt.next != null){
            list.add(tempPt.data);
            tempPt = tempPt.next.next;
        }
        if(tempPt != null) list.add(tempPt.data);

        tempPt = head;
        int i = 0;
        while(tempPt != null){
            tempPt.data = list.get(i++);
            tempPt = tempPt.next;
        }

        tempPt = head;
        printLL(tempPt);
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
