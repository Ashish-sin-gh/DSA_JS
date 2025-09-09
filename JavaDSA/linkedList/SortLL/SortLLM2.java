package JavaDSA.linkedList.SortLL;

public class SortLLM2 {
    public static void main(String[] args) {
        int[] arr = {0,2,2,0};
        Node head = new Node(arr[0]);
        insertFromArray(arr, head);
        
        System.out.println("before sort: ");
        printLL(head);

        head = sort012(head);

        System.out.println("after sort: ");
        printLL(head);
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

    public static Node sort012(Node head){
        if(head == null  || head.next == null) return head;

        Node ptMain = head;
        Node pt0 = null, pt1 = null, pt2 = null;
        Node pt0Store1Node = null, pt1Store1Node = null, pt2Store1Node = null;

        while(ptMain != null){
            if(pt0 == null && ptMain.data == 0 ){
                pt0 = ptMain;
                pt0Store1Node = ptMain;
                ptMain = ptMain.next;
                continue;
            }
            if(pt1 == null && ptMain.data == 1 ){
                pt1 = ptMain;
                pt1Store1Node = pt1;
                ptMain = ptMain.next;
                continue;
            }
            if(pt2 == null && ptMain.data == 2 ){
                pt2 = ptMain;
                pt2Store1Node = pt2;
                ptMain = ptMain.next;
                continue;
            }

            if(ptMain.data == 0){
                pt0.next = ptMain;
                pt0 = ptMain;
            }
            if(ptMain.data == 1){
                pt1.next = ptMain;
                pt1 = ptMain;
            }
            if(ptMain.data == 2){
                pt2.next = ptMain;
                pt2 = ptMain;
            }
            
            ptMain = ptMain.next;
        }

        if(pt0 != null && pt1 != null) pt0.next = pt1Store1Node;
        if(pt0 != null && pt1 == null) pt0.next = pt2Store1Node;
        if(pt1 != null) pt1.next = pt2Store1Node;
        if(pt2 != null) pt2.next = null;

        head = pt0Store1Node;
        if(pt0 == null && pt1 != null) head = pt1Store1Node;
        if(pt1 == null && pt0 == null) head = pt2Store1Node;
        return head;
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
