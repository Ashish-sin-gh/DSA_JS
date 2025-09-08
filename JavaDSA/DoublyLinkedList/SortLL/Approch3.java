package JavaDSA.DoublyLinkedList.SortLL;

public class Approch3 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,2,0};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);
        
        System.out.println("before sort: ");
        printLL(head);
        
        System.out.println("after sort: ");
        head = sortLL123(head);
        printLL(head);
    }

    public static Node sortLL123(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node pt0 = new Node(-1);
        Node pt0store = pt0;
        
        Node pt1 = new Node(-1);
        Node pt1store = pt1;
        
        Node pt2 = new Node(-1);
        Node pt2store = pt2;

        while(head != null){
            if(head.data == 0){
                pt0.next = head;
                pt0 = head;
            }
            if(head.data == 1){
                pt1.next = head;
                pt1 = head;
            }
            if(head.data == 2){
                pt2.next = head;
                pt2 = head;
            }

            head = head.next;
        }

        pt0.next = (pt1store.next != null) ? pt1store.next : pt2store.next;
        pt1.next = pt2store.next;
        pt2.next = null;
        return pt0store.next;
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
