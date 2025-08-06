package linkedList.DeletionInLinkedList;

public class DeleteLastElement {
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

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        
        Node head = new Node(arr[0]);
        Node moveablePointer = head;

        for(int i = 1; i < arr.length; i++){
            Node unlinkedNextNode = new Node(arr[i]);
            moveablePointer.nextNode = unlinkedNextNode;
            moveablePointer = moveablePointer.nextNode; 
        }

        // delete last element
        Node tempLL = head;
        if(tempLL == null){              // LL has no node
            System.out.println("Linked list is empty");
            return;
        } else if (tempLL.nextNode == null){    // LL has only one node
            head = null;
            return;
        } else {
            while(tempLL.nextNode.nextNode != null){
                tempLL = tempLL.nextNode;
            }
            tempLL.nextNode = null; 
        }

        // print link list
        Node tempLLtraverse = head; // preserve the head
        while (tempLLtraverse != null) {
            System.out.println(tempLLtraverse.data);
            tempLLtraverse = tempLLtraverse.nextNode;
        }
    }
}
