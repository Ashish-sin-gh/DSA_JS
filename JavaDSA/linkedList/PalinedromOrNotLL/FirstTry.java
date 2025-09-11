package JavaDSA.linkedList.PalinedromOrNotLL;

public class FirstTry {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);
        
        System.out.println("before reverse: ");
        printLL(head);

        System.out.println("after reverse: ");
        Node revHead = reverseLL(head);
        printLL(revHead);

        palindromChecker(head, revHead);
    }

    public static void palindromChecker(Node head, Node revHead){
        while(head != null){
            if(head.data != revHead.data){
                System.out.println("\nnot palinedrom");
                return;
            } 

            head = head.next;
            revHead = revHead.next;    
        }

        System.out.println("\nit is palinedrom");
    }

    public static Node reverseLL(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newNode = reverseLL(head.next);
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
