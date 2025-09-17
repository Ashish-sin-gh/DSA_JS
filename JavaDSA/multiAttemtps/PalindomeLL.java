package JavaDSA.multiAttemtps;

public class PalindomeLL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
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
        Node fastPt = head;
        Node slowPt = head;
        Node startPt1 = head;

        while(fastPt.next != null && fastPt.next.next != null){
            slowPt = slowPt.next;
            fastPt = fastPt.next.next;
        }

        Node startPt2 = slowPt.next;
        
        // reverse the 2nd part of LL
        Node revStartNode = reverseLL(startPt2);

        while(revStartNode != null){
            if(revStartNode.data != startPt1.data){
                reverseLL(revStartNode);
                return false;
            }
            revStartNode = revStartNode.next;
            startPt1 = startPt1.next;
        }
        reverseLL(revStartNode);    
        return true;

    }

    public static Node reverseLL(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newNode = reverseLL(head.next);
        Node frontNode = head.next;
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
