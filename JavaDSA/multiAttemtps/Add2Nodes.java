package JavaDSA.multiAttemtps;

public class Add2Nodes {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        Node head1 = new Node(arr1[0]);
        insertFromArray(arr1, head1);
        int[] arr2 = {2,3,4};
        Node head2 = new Node(arr2[0]);
        insertFromArray(arr2, head2);

        // main code
        Node dummyNode = new Node(-1);
        Node finalpointer = dummyNode; 
        Node ll1Pointer = head1;
        Node ll2Pointer = head2;
        int carry = 0;

        while(ll1Pointer != null || ll2Pointer!= null){
            int sum = carry;
            if(ll1Pointer != null) sum += ll1Pointer.data;
            if(ll2Pointer != null) sum += ll2Pointer.data;
            
            carry = sum / 10;
            sum = sum % 10;
            
            Node newNode = new Node(sum);
            finalpointer.next = newNode;
            finalpointer = finalpointer.next;

            if(ll1Pointer != null) ll1Pointer = ll1Pointer.next;
            if(ll2Pointer != null) ll2Pointer = ll2Pointer.next;
        }
        
        if(carry != 0){
            Node carryNode = new Node(carry);
            finalpointer.next = carryNode;
        }

        dummyNode = dummyNode.next;

        printLL(dummyNode);        
    }

    public static void printLL(Node head){
        while(head != null){
            System.out.println("data- " + head.data + 
                "   next- " + (head.next == null ? "null" : head.next.data) 
                );
            head = head.next;
        }
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
