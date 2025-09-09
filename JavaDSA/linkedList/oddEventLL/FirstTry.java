// using 2 new Linked List
// not very optimised soln

package JavaDSA.linkedList.oddEventLL;

public class FirstTry {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);

        // code 
        Node tempPointer = head;
        int count = 0;

        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);

        Node dummy1pt = dummy1;
        Node dummy2pt = dummy2;

        while(tempPointer != null){
            count++;
            if(count % 2 != 0){
                Node newOddNode = new Node(tempPointer.data);
                dummy1pt.next = newOddNode;
                dummy1pt = dummy1pt.next;
            } else{
                Node newEvenNode = new Node(tempPointer.data);
                dummy2pt.next = newEvenNode;
                dummy2pt = dummy2pt.next;
            }
            tempPointer = tempPointer.next;
        }

        dummy2pt = dummy2.next; 
        dummy2 = null;
        dummy1pt.next = dummy2pt; 
        dummy1pt = dummy1.next;

        Node tempPt = dummy1pt;
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
