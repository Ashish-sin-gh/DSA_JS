// time complexity -> O(2n)
// space complexity -> O(n)

// optimization required - dont use extra space

package JavaDSA.linkedList.PalinedromOrNotLL;

import java.util.Stack;

public class StackUse {
    public static void main(String[] args) {
        int[] arr = {1,2,22,1};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);

        palindromChecker(head);
    }

    public static void palindromChecker(Node head){
        // stack will be used for pushing the data of each node and then using LIFO comparing it.
        Stack<Integer> st = new Stack<>();
        Node tempPt = head;
        while(tempPt != null){
            st.push(tempPt.data);
            tempPt = tempPt.next;
        }
        while(head != null){
            int peek = st.pop();
            if(peek != head.data){
                System.out.println("\nnot palindrom");
                return;
            }
            head = head.next;
        }    
        System.out.println("\nis palindrom");
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
