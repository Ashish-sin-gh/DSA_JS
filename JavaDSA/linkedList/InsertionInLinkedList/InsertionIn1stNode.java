/*
 * to insert in the head of a linkedlist - Just create a new node and point the nodes next to head of the Linked list
 * and then make the head point to that new node 
 * this will make it the first node in the linked list 
 */

package linkedList.InsertionInLinkedList;

public class InsertionIn1stNode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        Node head = new Node(arr[0]);
        Node moveablePointer = head;

        for(int i = 1; i < arr.length; i ++){
            Node unlinkedNode = new Node(arr[i]);
            moveablePointer.next = unlinkedNode;
            moveablePointer = unlinkedNode;
        }

        // add a new to node to the head
        Node newNode = new Node(100, head);
        head = newNode;
        
        // print the Linked list
        Node tempLLprint = head;
        while(tempLLprint != null){
            System.out.println(tempLLprint.data);
            tempLLprint = tempLLprint.next;
        }
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node (int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
