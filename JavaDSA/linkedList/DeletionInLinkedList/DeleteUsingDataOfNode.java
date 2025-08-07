package linkedList.DeletionInLinkedList;

public class DeleteUsingDataOfNode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int value = 4;
        Node head = new Node(arr[0]);
        Node moveablePt = head;
        
        for(int i = 1; i < arr.length; i++ ){
            Node unlinkedNode = new Node(arr[i]);
            moveablePt.next = unlinkedNode;
            moveablePt = unlinkedNode;
        }

        // delete by value
        Node tempLL = head;
        while(tempLL.next.data != value){
            tempLL = tempLL.next;
        }
        tempLL.next = tempLL.next.next;

        //print the LL
        Node tempLLTraverse = head;
        while(tempLLTraverse != null){
            System.out.println(tempLLTraverse.data);
            tempLLTraverse = tempLLTraverse.next;
        }
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
