package numberSystem;

import java.util.Scanner;

public class anyBaseMultiply {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number 1: ");
        int num1 = scn.nextInt();
        System.out.print("enter the number 2: ");
        int num2 = scn.nextInt();
        System.out.print("enter the base: ");
        int base = scn.nextInt();
        
        // int finalOutput = 0;
        int i = 0;
        int sumOP = 0;

        while(num2 != 0){
            int mulOP = getMultiplyOfSingleDigit(base, num1, num2 % 10) * (int) Math.pow(10, i);
            sumOP = getSumOfNum(base, sumOP, mulOP);

            i ++;
            num2 /= 10;

        }
        System.out.println("the multiplcation is: " + sumOP);
        
    }

    public static int getMultiplyOfSingleDigit(int base, int n1, int digit2){
        int carry = 0;
        int finalVal = 0;
        int i = 0;

        while(n1 != 0){
            int digit1 = n1 % 10;
            int mulOfDigit = (digit2 * digit1) + carry; 
            int val = mulOfDigit % base;
            carry = mulOfDigit / base;

            finalVal += val * Math.pow(10, i);
            
            i ++;
            n1 /= 10;
            // System.out.println(finalVal);
        }
        return finalVal;
    }


    public static int getSumOfNum(int base, int n1, int n2){
        int carry = 0;
        int finalSum = 0;
        int i = 0;

        while(n1 != 0 || n2 != 0 || carry != 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int sumOfDigit = d1 + d2 + carry;
            carry = sumOfDigit / base;
            int val = sumOfDigit % base;
            finalSum += val * (int) Math.pow(10, i);
            
            i++;
            n1 /= 10;
            n2 /= 10;
        }
        return finalSum;
    }
}
