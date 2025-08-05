package linkedList;

public class ArrayToLinkedList {
    public static void main(String [] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        
        Node head = new Node(arr[0]);
        Node moveablePointer = head;

        for(int i = 1; i < arr.length; i++){
            Node unlinkedNextNode = new Node(arr[i]);
            moveablePointer.nextNode = unlinkedNextNode;
            moveablePointer = moveablePointer.nextNode; 
        }

        // traverse and print the linked list
        Node tempLL = head; // created temperory reference to not loose the head
        while(tempLL != null){
            System.out.println(tempLL.data);
            tempLL = tempLL.nextNode;
        }    
    }

    // each node will contain element and next node reference  
    public static class Node{
        int data; 
        Node nextNode;

        Node(int element, Node referenceNextNode){
            this.data = element;
            this.nextNode = referenceNextNode;
        }

        Node(int element){
            this.data = element;
            this.nextNode = null;
        }
    }
}
