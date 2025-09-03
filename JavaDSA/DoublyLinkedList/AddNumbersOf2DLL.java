package JavaDSA.DoublyLinkedList;

public class AddNumbersOf2DLL {
    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        
        Node head1 = new Node(arr1[0]);
        Node moveableHead1 = head1;
        insertFromArray(arr1, moveableHead1);
        
        Node head2 = new Node(arr2[0]);
        Node moveableHead2 = head2;
        insertFromArray(arr2, moveableHead2);
        
        // print the DLL
        // Node printNode1 = head1;
        // printDLL(printNode1);
        // System.out.println();
        // Node printNode2 = head2;
        // printDLL(printNode2);

        // reverse DLL
        // Node tempPointer1 = head1;
        // reverseDLL(tempPointer1);

        // Node tempPointer2 = head2;
        // reverseDLL(tempPointer2); 

        // System.out.println(tempPointer1.back.data);
        
        int number1 = 0;
        int number2 = 0;
        int power1 = -1;
        int power2 = -1;

        Node tempPointer1 = head1;
        while(tempPointer1.next != null){
            tempPointer1 = tempPointer1.next;
            // power1++;
        }

        Node tempPointer2 = head1;
        while(tempPointer2.next != null){
            tempPointer2 = tempPointer2.next;
            // power2++;
        }

        while(tempPointer1 != null){
            number1 = number1 + (tempPointer1.data * (int)Math.pow(10, ++power1));
            tempPointer1 = tempPointer1.back;
        }

        while(tempPointer2 != null){
            number2 = number2 + (tempPointer2.data * (int)Math.pow(10, ++power2));
            tempPointer2 = tempPointer2.back;
        }
        
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number1+number2);
    }

    public static void insertFromArray(int[] arr, Node head){
        Node moveableHead = head;
        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i], null, moveableHead);
            moveableHead.next = newNode;
            moveableHead = moveableHead.next;
        }
    }

    public static void reverseDLL(Node head){
        while(head != null){
            Node nextNode = head.next;
            head.next = head.back;
            head.back = nextNode;
            head = head.back;
        }
        
    }

    public static void printDLL(Node head){
        while(head != null){
            System.out.println("data- " + head.data + 
                "   back- " + (head.back == null ? "null" : head.back.data) +
                "   next- " + (head.next == null ? "null" : head.next.data) 
                );
            head = head.next;
        }
    }

    public static class Node{
        int data;
        Node next;
        Node back;

        Node(int data){
            this.data = data;
            this.back = null;
            this.next = null;
        }

        Node(int data, Node next, Node back){
            this.data = data;
            this.back = back;
            this.next = next;
        }
    }
}
