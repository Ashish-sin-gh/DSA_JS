package array;

import java.util.Scanner;

public class indexOfElement {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the length of the array: ");
        int size = scn.nextInt();
        System.out.print("enter the key: ");
        int key = scn.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("enter the value in array [" + i + "]: ");
            arr[i] = scn.nextInt();
        }

        int index = -1;
        for(int i = 0; i < size; i++){
            if(key == arr[i]){
               index = i;
                break;
            }
        }
        System.out.print("\nthe index of key in the array is: "+ index);

        scn.close();
    }
}
