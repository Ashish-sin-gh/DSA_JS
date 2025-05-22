package array;

import java.util.Scanner;


public class sumOfArray {
    
    public static void sumOf2Array(int[] arr1,  int[] arr2){
        int[] op = new int[arr1.length >= arr2.length ? arr1.length : arr2.length];
        int carry = 0;
        int value = 0;
        int sum = 0;

        int arr1index = arr1.length - 1;
        int arr2index = arr2.length - 1;
        int opIndex = op.length - 1;

        while(opIndex >= 0){
            sum = carry;

            if(arr1index >= 0){
                sum += arr1[arr1index];
            } 

            if(arr2index >= 0){
                sum += arr2[arr2index];
            }

            carry = sum / 10;
            sum = sum % 10;

            op[opIndex] = sum;

            arr1index --;
            arr2index --;
            opIndex --;
        }
        
        if (carry != 0){
            System.out.println(carry);
        }
        for(int i = 0; i < op.length; i++){
            System.out.println(op[i]);
        }
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("enter the size of array 1: ");
        int size1 = scn.nextInt();
        int[] arr1  = new int[size1];
        System.out.println("enter the values in array 1: ");
        for(int i = 0; i < size1; i ++){
            arr1[i] = scn.nextInt();
        }

        System.out.print("enter the size of array 2: ");
        int size2 = scn.nextInt();
        int[] arr2 = new int[size2];        
        System.out.println("enter the values in array 2: ");
        for(int i = 0; i < size2; i ++){
            arr2[i] = scn.nextInt();
        }

        sumOf2Array(arr1, arr2);

        scn.close();
    }
}
