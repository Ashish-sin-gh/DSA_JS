package numberSystem;

import java.util.Scanner;

public class anyBaseSubstraction {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number 1: ");
        int num1 = scn.nextInt();
        System.out.print("enter the number 2: ");
        int num2 = scn.nextInt();
        System.out.print("enter the base: ");
        int base = scn.nextInt();

        int borrow = 0;
        int finalAnswer = 0;
        int i = 0;

        while(num1 != 0 || num2 != 0 || borrow != 0){
            int d1 = num1 % 10;
            int d2 =  num2 % 10;

            int op = 0;
            
            d1 = d1 - borrow;

            if(d1 < d2){
                borrow = 1;
                op = d1 + base - d2;   
            } else {
                borrow = 0;
                op = d1 - d2;
            }

            finalAnswer += op * (int) Math.pow(10, i);
            
            i ++;
            num1 /= 10;
            num2 /= 10;
        }

        System.out.println("op is: " + finalAnswer);
    }
}
