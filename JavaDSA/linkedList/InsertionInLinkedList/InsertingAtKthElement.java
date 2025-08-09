package JavaDSA.linkedList.InsertionInLinkedList;

public class InsertingAtKthElement {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6};
         int key = 6; // add new node after 2nd position (2nd node)

        Node head = new Node(arr[0]);
        Node moveablePointer = head;

        for(int i = 1; i < arr.length; i ++){
            Node unlinkedNode = new Node(arr[i]);
            moveablePointer.next = unlinkedNode;
            moveablePointer = unlinkedNode;
        }

        //count nodes
        int counter = 0;
        Node llForCount = head;
        while(llForCount != null){
            counter++;
            llForCount = llForCount.next;
        }

        System.out.println(counter);

        // insert in Kth position 
        Node tempLLinsert = head;

        if(tempLLinsert == null){
            if(key == 1){
                Node newNode = new Node(100);
                head = newNode;
            }
        }
        if(key == 1){
            Node newNode = new Node(100, tempLLinsert);
            head = newNode;
        } else if(key == counter){
            Node newNode = new Node(100, null);

            while(tempLLinsert.next !=  null){
                tempLLinsert = tempLLinsert.next;
            }
            tempLLinsert.next = newNode;

        } else{
            for(int i = 1; i < arr.length; i++){
                if(i == key-1){
                    Node newNode = new Node(100, tempLLinsert.next);
                    tempLLinsert.next = newNode;
                    break;
                }
                tempLLinsert = tempLLinsert.next;
            }
        }

        // print the Linked list
        Node tempLLprint = head;
        while(tempLLprint != null){
            System.out.print(tempLLprint.data + "  ");
            tempLLprint = tempLLprint.next;
        }
    }

     public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node (int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
