package array;

import java.util.Scanner;

public class spanOfArray {

    public static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the length of the array: ");
        int size = scn.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("enter the value in array [" + i + "]: ");
            arr[i] = scn.nextInt();
        }

        System.out.println("\nmax value in the array is: " + getMax(arr));
        System.out.println("min value in the array is: " + getMin(arr));

        scn.close();
    }
}
