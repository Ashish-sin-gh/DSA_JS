// chnage the given linked list only to get to the soln 
// time complexity - O(2n)
// space complexity - O(1)

// it will require to divide the LL into two equal parts and second part will be reverse for comparison

// how to divide the LL in two equal part?
// tortoise and hare algo - slow pointer will move 1 node and fast pointer will move 2 node at a time until fast reaches 2nd last node of LL

package JavaDSA.linkedList.PalinedromOrNotLL;

public class usingSameLL {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);

        boolean cp = checkPalindrom(head);
        if(cp){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean checkPalindrom(Node head){
        Node slowPt = head;
        Node fastPt = head;
        Node start1st = head;

        while(fastPt.next != null && fastPt.next.next != null){
            fastPt = fastPt.next.next;
            slowPt = slowPt.next;
        }

        Node start2nd = slowPt.next;

        // reverse 2nd half of the LL
        Node revLL = reverse2ndLL(start2nd);

        // check palindrom
        while(revLL != null){
            if(start1st.data != revLL.data){
                reverse2ndLL(revLL);
                return false;
            }
            revLL = revLL.next;
            start1st = start1st.next;
        }

        reverse2ndLL(revLL);
        return true;

    }
    
    public static Node reverse2ndLL(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newNode = reverse2ndLL(head.next);
        Node frontNode = newNode;
        frontNode.next = head;
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
