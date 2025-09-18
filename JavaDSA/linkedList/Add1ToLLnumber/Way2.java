package JavaDSA.linkedList.Add1ToLLnumber;

public class Way2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);

        Node revHead = reverseLL(head);

        int carry = 0;
        Node tempRevhead = revHead;
        int counter = 0;

        while(revHead != null){
            if(carry > 0){
                revHead.data += carry; 
                carry = revHead.data / 10;
                revHead.data %= 10;   
            }

            if (counter == 0){
                revHead.data += 1;
                carry = revHead.data / 10;
                revHead.data %= 10;
                
                counter++;
            }

            revHead = revHead.next;
        }

        if(carry > 0){
            Node carryNode = new Node(counter);
            revHead.next = carryNode;
        }

        head = reverseLL(tempRevhead);

    } 

    // reverse the LL
    public static Node reverseLL(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node returnedNode = reverseLL(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return returnedNode;   
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
