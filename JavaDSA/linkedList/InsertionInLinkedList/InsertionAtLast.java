/* 
 * to insert at the last - create a new node - traverse the previous LL to the last node and then point that node to new node 
 * 
 * time complexity - O(n)
 */

package linkedList.InsertionInLinkedList;

public class InsertionAtLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        Node head = new Node(arr[0]);
        Node moveablePointer = head;

        for(int i = 1; i < arr.length; i ++){
            Node unlinkedNode = new Node(arr[i]);
            moveablePointer.next = unlinkedNode;
            moveablePointer = unlinkedNode;
        }

        // insert in the end
        Node tempLL = head;
        while(tempLL.next != null){
            tempLL = tempLL.next;
        }
        Node newNode = new Node(100); // created new Node
        tempLL.next = newNode; // last node is linked to this new node - making it the new last node

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
