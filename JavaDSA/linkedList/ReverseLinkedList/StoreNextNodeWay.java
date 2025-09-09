package JavaDSA.linkedList.ReverseLinkedList;

public class StoreNextNodeWay {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);
        
        System.out.println("before reverse: ");
        printLL(head);

        System.out.println("after reverse: ");
        head = reverseLL(head);
        printLL(head);
    }   

    public static Node reverseLL(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node headTemp = head;
        Node prevNode = head;
        int count = 1;
        while(headTemp != null){
            Node nextNodeStore = headTemp.next;
            if(count == 1){
                headTemp.next = null;
                count++;
            } else {
                headTemp.next = prevNode;
            }
            
            prevNode = headTemp;
            headTemp = nextNodeStore;
        }

        return prevNode;
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
