package linkedList;

public class SearchInALinkList {
    public static void main(String[] args) {
        int[] arr = {15,20,45,36,57,85,12};
        int key = -1;

        Node head = new Node(arr[0]);
        Node moveableHead = head;

        for(int i = 1; i < arr.length; i++){
            Node unlinkedNode = new Node(arr[i]);
            moveableHead.next = unlinkedNode;
            moveableHead = unlinkedNode;
        }

        Node tempLL = head;
        while(tempLL != null){
            if(tempLL.data == key){
                System.out.println("found");
                return;
            } 
            tempLL = tempLL.next;
        }
        System.out.println("not found");
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        } 
    }
}
