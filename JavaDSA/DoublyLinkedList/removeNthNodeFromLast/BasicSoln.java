// the most basic soln - using counter to count the number of Node in the linked list and then deleteing the desired node.
// time complexity -> O(len of linked list) + O(len - n - 1) -> O(2len)
// space complexity -> O(1)
package JavaDSA.DoublyLinkedList.removeNthNodeFromLast;

public class BasicSoln{
    public static void main(String[] args){
        int[] arr = {5,10,20,45,85,74,6};
        int n = 4; 
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);
        head = removeNode(head, n);
        printLL(head);
    }

    public static Node removeNode(Node head, int n){
        if(head == null || head.next == null){
            return head;
        }
        // count the nodes
        int totalNode = 0; 
        Node temp = head;
        while(temp != null){
            totalNode++;
            temp = temp.next;
        }

        if(totalNode == n){
            // delete head 
            return head.next;
        }

        if(n == 1){
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }

        int acutalDelNode = totalNode - n - 1;
        temp = head;

        while(acutalDelNode  != 0){
            acutalDelNode--;
            temp = temp.next; 
        } 

        Node deleteNode = temp.next;
        temp.next = temp.next.next;
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
