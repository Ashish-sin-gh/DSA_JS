package JavaDSA.multiAttemtps;

public class add1ToLLRecurssionWay {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);

        int carry = recuression(head);

        if(carry == 1){
            Node carryNode = new Node(carry, head);
            head = carryNode;
            carry--;
        }

        printLL(head);
    }

    public static int recuression(Node head){
        if(head == null){
            return 1;
        }

        int carry = recuression(head.next);

        head.data = head.data + carry;
        carry = head.data / 10;
        head.data = head.data % 10;

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
