// reverse LL usinf linked list
// time complexity - O(n)
// space complexity - O(1)

package JavaDSA.linkedList.ReverseLinkedList;

public class RecussionWay {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);
        
        System.out.println("before reverse: ");
        printLL(head);

        System.out.println("after reverse: ");
        head = reverser(head);
        printLL(head);
    } 

    public static Node reverser(Node head){
        // base case
        if(head == null || head.next == null){
            return head;
        }

        Node newNode = reverser(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newNode;
    }

    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + "  ");
            head = head.next;
        }
        System.out.println();
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
