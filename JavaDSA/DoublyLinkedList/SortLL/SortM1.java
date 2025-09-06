// the most basic way - brute way
// we will replace the data of the node with the desired data
// use counter for 0,1,2

// time complexity - O(2n) -> two pass solution
// space complexity - O(1)

package JavaDSA.DoublyLinkedList.SortLL;

public class SortM1 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,1,2,1,2,1,0};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);
        
        System.out.println("before sort: ");
        printLL(head);

        System.out.println("after sort: ");
        sort012(head);
        printLL(head);
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

    public static void sort012(Node head){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        Node headTemp = head;

        while(headTemp != null){
            if(headTemp.data == 0){
                count0++;
            }
            if(headTemp.data == 1){
                count1++;
            } 
            if(headTemp.data == 2){
                count2++;
            }
            headTemp = headTemp.next;
        }

        headTemp = head;

        while(headTemp != null){
            if(count0 > 0){
                headTemp.data = 0;
                count0--;
            } else if(count1 > 0){
                headTemp.data = 1;
                count1--;
            } else if(count2 > 0){
                headTemp.data = 2;
                count2--;
            }
            headTemp = headTemp.next;
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
