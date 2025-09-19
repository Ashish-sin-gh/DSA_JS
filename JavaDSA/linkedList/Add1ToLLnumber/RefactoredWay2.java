package JavaDSA.linkedList.Add1ToLLnumber;

public class RefactoredWay2 {

    public static void main(String[] args){
        int[] arr = {9,9,9};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);

        head = reverse(head);
        head = add1(head);
        printLL(head);
    }

    public static Node add1(Node head){
        Node headStore = head;
        int carry = 1;
        while(head != null){
            if(carry == 1){
                head.data += carry;
                carry = head.data / 10;
                head.data = head.data % 10;
            }
            
            if(carry == 0){
                break;
            }
            head = head.next;
        }
        
        // System.out.println(head.next.next.data);
        head = reverse(headStore);
        // System.out.println(head.next.next.data);
        
        if(carry == 1){
            Node carryNode = new Node(carry, head);
            head = carryNode;
            carry = 0;
        }
        return head;
    }

    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newNode = reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newNode;
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

    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + "  ");
            head = head.next;
        }
        System.out.println();
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
