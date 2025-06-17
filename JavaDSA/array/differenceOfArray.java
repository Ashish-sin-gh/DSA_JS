package array;

import java.util.Scanner;

public class differenceOfArray {
    public static void differenceOf2Array(int[] arr1, int[] arr2){
        // System.out.println("dfdf");
        int[] difference = new int[arr2.length];

        int arr1index = arr1.length - 1;
        int arr2index = arr2.length - 1;
        int diffIndex = difference.length - 1;

        int borrow = 0;

        while(diffIndex >= 0){
            int arr1indexValue = arr1index >= 0 ? arr1[arr1index] : 0;
            int diff = -borrow;

            if(arr2index >= 0){
                diff += arr2[arr2index];
            }
            if(arr1index >= 0){
                diff -= arr1indexValue;
            }
            if(arr2[arr2index] - borrow < arr1indexValue){
                borrow = 1;
                diff += 10;
            } else {
                borrow = 0;
            }

            difference[diffIndex] = diff;

            arr1index --;
            arr2index --;
            diffIndex --;
        }

        for(int i = 0; i < difference.length; i++ ){
            System.out.println(difference[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("enter the size of array 1: ");
        int size1 = scn.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("enter the values: ");
        for(int i = 0; i < size1; i ++){
            arr1[i] = scn.nextInt();
        }

        System.out.print("enter the size of array 2: ");
        int size2 = scn.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("enter the values: ");
        for(int i = 0; i < size2; i ++){
            arr2[i] = scn.nextInt();
        }

        System.out.println("\ndifference is: ");
        differenceOf2Array(arr1, arr2);

        scn.close();
    }
}
