// in this approch we will be making 2 pointers and one will sitting (n) steps above other pointer so that we can stop 
// slow pointer just before the deleteable node 

package JavaDSA.DoublyLinkedList.removeNthNodeFromLast;

public class BetterApproch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = 8; 
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);

        head = deleteNode(head, n);
        printLL(head);
    }

    public static Node deleteNode(Node head, int k){
        if(head == null || head.next == null){
            return null;
        } 

        Node fastPt = head;

        while(k !=  0){
            fastPt = fastPt.next;
            k--;
            if(fastPt.next == null){
                break;
            }
        }

        if(k != 0){
            Node tempHead = head;
            head = head.next;
            tempHead.next = null;
            return head;

        }

        Node slowPt = head;

        while(fastPt.next != null){
            slowPt = slowPt.next;
            fastPt = fastPt.next;
        }

        if(fastPt == slowPt.next){
            slowPt.next = null;
            return head;
        }

        Node deleteNode = slowPt.next;
        slowPt.next = deleteNode.next;
        deleteNode.next = null;
        return head;
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
