package JavaDSA.multiAttemtps;

public class CheckPalindrom {
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
        // divide LL
        Node slowPt = head;
        Node fastPt = head;
        Node start1stLL = head;

        while(fastPt.next != null && fastPt.next.next != null){
            slowPt = slowPt.next;
            fastPt = fastPt.next.next;
        }

        Node start2ndLL = slowPt.next;
        
        Node reversed2ndLLstart = reverse(start2ndLL); 
        Node reversed2ndLLstartStore = reversed2ndLLstart;

        while(reversed2ndLLstart != null){
            if(reversed2ndLLstart.data != start1stLL.data){
                reverse(reversed2ndLLstartStore);
                return false;
            }
            reversed2ndLLstart = reversed2ndLLstart.next;
            start1stLL = start1stLL.next;
        }
        
        reverse(reversed2ndLLstartStore);
        return true;
    }

    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node returnedNode = reverse(head.next);
        Node frontNode = head.next;
        frontNode.next = head;
        head.next = null;

        return returnedNode;
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
