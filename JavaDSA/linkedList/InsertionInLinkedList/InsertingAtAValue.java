/*
 * enter new node before the value of x 
 */

package JavaDSA.linkedList.InsertionInLinkedList;

public class InsertingAtAValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
         int value = 6; // add new node after 2nd position (2nd node)

        Node head = new Node(arr[0]);
        Node moveablePointer = head;
        int count = 1;

        for(int i = 1; i < arr.length; i ++){
            Node unlinkedNode = new Node(arr[i]);
            moveablePointer.next = unlinkedNode;
            moveablePointer = unlinkedNode;
            count++;
        }

        // insert before the given value
        Node tempLLnode = head;
        for(int i = 1; i <= count; i++){
            if(tempLLnode.data == value && i == 1){
                Node newNode = new Node(100, tempLLnode);
                head = newNode;
                break;
            }
            if(value == tempLLnode.next.data){
                Node newNode = new Node(100, tempLLnode.next);
                tempLLnode.next = newNode;
                break;
            }

            tempLLnode = tempLLnode.next;
        }

        // print the Linked list
        Node tempLLprint = head;
        while(tempLLprint != null){
            System.out.print(tempLLprint.data + "  ");
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

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
