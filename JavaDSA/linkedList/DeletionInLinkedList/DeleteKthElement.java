package linkedList.DeletionInLinkedList;

public class DeleteKthElement {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};
        int key = 4;
        // convert array to LL + LL length counter
        Node head = new Node(arr[0]);
        Node moveablePointer = head;

        int nodeCount = 1;

        for(int i = 1; i < arr.length; i++){
            Node unlinkedNode = new Node(arr[i]);
            moveablePointer.next = unlinkedNode;
            moveablePointer = unlinkedNode;

            nodeCount++;
        }

        // print linked list 
        Node tempLLPrinter1 = head;
        while(tempLLPrinter1 != null){
            System.out.println(tempLLPrinter1.data);
            tempLLPrinter1 = tempLLPrinter1.next;
        }
        System.out.println("LL node count before deletion - " + nodeCount);

        // delete kth node

        Node tempLL = head;
        if(tempLL ==  null){
            System.out.println("LL is empty");
            return;
        }

        if(key == 1){
            if(tempLL.next == null){
                tempLL =  null;
            } else {
                tempLL = tempLL.next;
            }
        } else {
            // stop the node traversal at positon k-1 and then point node.next to k+1;
            for(int i = 1; i <= nodeCount; i++){
                if(i == key - 1){
                    tempLL.next = tempLL.next.next;
                    nodeCount--;
                    break; 
                }
                tempLL = tempLL.next;
            }
        }
        
        // print linked list
        System.out.println(); 

        Node tempLLPrinter2 = head;
        while(tempLLPrinter2 != null){
            System.out.println(tempLLPrinter2.data);
            tempLLPrinter2 = tempLLPrinter2.next;
        }
         System.out.println("LL node count after deletion - " + nodeCount);
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
