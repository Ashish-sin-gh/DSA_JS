package linkedList;

public class FindLengthOfTheLinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        Node head = new Node(arr[0]);
        Node moveableHead = head;

        for(int i = 1; i < arr.length; i++){
            Node unlinkedNextNode = new Node(arr[i]);
            moveableHead.nextNode = unlinkedNextNode;
            moveableHead = unlinkedNextNode;
        }

        // calculate the length
        int count = 0;
        Node tempLL = head;
        while(tempLL != null){
            count++;
            tempLL = tempLL.nextNode;
        }
        System.out.println("length of the Linked list is: " + count);
    }

    public static class Node{
        int data;
        Node nextNode;

        Node(int data, Node nextNode){
            this.data = data;
            this.nextNode = nextNode;
        }
        
        Node(int data){
            this.data = data;
            this.nextNode = null;
        }
    }
}
