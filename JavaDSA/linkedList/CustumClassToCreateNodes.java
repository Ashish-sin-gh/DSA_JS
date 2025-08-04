package linkedList;

public class CustumClassToCreateNodes {
    static class Node{
        int element;
        Node next; // points to next node in the list

        Node(int data, Node nextNode){
            this.element = data;
            this.next = nextNode;
        }

        Node(int data){
            this.element = data;
            this.next = null;
        }
    }
        
    public static void main(String[] args){
        Node n1 = new Node(8);
        n1.next = new Node(7);
        n1.next.next = new Node(6);

        Node current = n1; // temproraily store the Node Object as you dont want to lose the refernce (n1) from the head.

        while(current != null){
            System.out.println(current.element);
            current = current.next;
        }
    }
}
