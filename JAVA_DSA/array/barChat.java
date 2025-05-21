package array;

import java.util.Scanner;

public class barChat {
    public static int getMaxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the length of the array: ");
        int size = scn.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("enter the value in array [" + i + "]: ");
            arr[i] = scn.nextInt();
        }

        int maxValue = getMaxValue(arr);
        System.out.println();
        for(int row = 1; row <= maxValue; row ++){
            for(int col = 1; col <= size; col ++ ){
                // print space
                if(row <= maxValue - arr[col-1]){
                    System.out.print("   ");
                } else {
                // print star
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
