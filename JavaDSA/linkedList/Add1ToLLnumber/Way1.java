// not still missing edge cases

package JavaDSA.linkedList.Add1ToLLnumber;

public class Way1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);

        Node revHead = add1ToLL(head, carry);
        
        if(carry > 0 && ){
            head.data += carry;
            carry = 0;     
        }

        printLL(revHead);

    }
    
    public static int carry = 0;

    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + "  ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node add1ToLL(Node head,int carry){
        // using reverse method and recursion to slove this
        Node headStore = head;
        if(head == null || head.next == null){
            return head;
        }

        Node digitNode = add1ToLL(head.next,carry);
        Node frontNode = head.next;

        if(carry > 0) {
            frontNode.data += carry;
            frontNode.data = frontNode.data % 10;
            carry = frontNode.data / 10;
        }

        if(digitNode.next == null) {
            frontNode.data += 1;
            frontNode.data = frontNode.data % 10;
            carry = frontNode.data / 10;
        }

        frontNode.next = head;
        head.next = null;
        return digitNode;
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
