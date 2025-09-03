// no need to reverse the Linked List

package JavaDSA.DoublyLinkedList.Add2Nodes;

public class optimizedWayAdd2Nodes {
    public static void main(String[] args) {
        int[] arr1 = {7, 8, 2, 8};
        Node head1 = new Node(arr1[0]);
        insertFromArray(arr1, head1);
        int[] arr2 = {9, 2, 1};
        Node head2 = new Node(arr2[0]);
        insertFromArray(arr2, head2);

        // Node tempLL1 = head1;
        // Node tempLL2 = head2;
        // printLL(tempLL1);
        // System.out.println();
        // printLL(tempLL2);

        // main code
        int carry = 0;
        // int sum = 0;
        Node tempLL1 = head1;
        Node tempLL2 = head2;
        Node resultLL = new Node(-1);
        Node tempResLL =  resultLL;

        while(tempLL1 != null || tempLL2 != null){
            int sum = carry;
            if(tempLL1 != null) sum += tempLL1.data;
            if(tempLL2 != null) sum += tempLL2.data;
            
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            tempResLL.next = newNode;
            tempResLL = newNode;

            if(tempLL1 != null) tempLL1 = tempLL1.next;
            if(tempLL2 != null) tempLL2 = tempLL2.next;
        }

        if(carry != 0) {
            Node carryNode = new Node(carry);
            tempResLL.next = carryNode;
        }
        Node head = resultLL.next;

        //print LL
        Node tempNode = head;
        printLL(tempNode);
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
            System.out.println("data- " + head.data + 
                "   next- " + (head.next == null ? "null" : head.next.data) 
                );
            head = head.next;
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
