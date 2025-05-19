package numberSystem;

import java.util.Scanner;

public class anyBaseAddition {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number 1: ");
        int num1 = scn.nextInt();
        System.out.print("enter the number 2: ");
        int num2 = scn.nextInt();
        System.out.print("enter the base: ");
        int base = scn.nextInt();

        int carry = 0;
        int i = 0;
        int total = 0;
        while(num1 != 0 || num2 != 0 || carry != 0){
            int rem1 = num1 % 10;
            int rem2 = num2 % 10;
            int sum = carry + rem1 + rem2;
            int remVal = sum % base;

            carry = sum / base;
            total += remVal * Math.pow(10, i);

            num1 /= 10;
            num2 /= 10;
            i++;
        }
        System.out.println("op is: " + total);  
    }
}
