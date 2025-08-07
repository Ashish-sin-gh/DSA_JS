package JavaDSA.multiAttemtps;

public class DeleteKthElementLinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int key = 4;
        Node head = new Node(arr[0]);
        Node moveablePt = head;
        int count = 1;
        
        for(int i = 1; i < arr.length; i++ ){
            Node unlinkedNode = new Node(arr[i]);
            moveablePt.next = unlinkedNode;
            moveablePt = unlinkedNode;
            count++;
        }

        // delete kth node
        Node tempLL = head;
        if(tempLL == null){
            System.out.println("LL is empty");
            return;
        }
        if( key == 1){
            tempLL = null;
        } else if(key == arr.length){
            while(tempLL.next.next != null){
                tempLL = tempLL.next;
            }
            tempLL.next = null;
        } else{
            for(int i = 1; i <= count; i ++){
                if(i == key - 1){
                    tempLL.next = tempLL.next.next;
                    break;
                }
                tempLL = tempLL.next;
            }
        }

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
