// why we have to use recurssion - as this is LL has not back pointer - recurssion has BACK TRACKING

package JavaDSA.linkedList.Add1ToLLnumber;

public class RecurssionWay{
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);

        int carry = recurssionAdd1(head);

        if(carry == 1){
            Node carryNode = new Node(carry, head);
            head = carryNode;
            carry--;
        }

        printLL(head);
    }

    // public static int carry = 1;

    public static int recurssionAdd1(Node head){
        if(head == null){
            int carry = 1;
            return carry;
        }   

        int carry = recurssionAdd1(head.next);

        head.data += carry;
        carry = head.data / 10; 
        head.data %= 10;
        // System.out.println(carry);
        
        return carry; 
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