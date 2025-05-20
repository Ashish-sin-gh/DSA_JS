package numberSystem;

import java.util.Scanner;

public class freqOfDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = scn.nextInt();
        System.out.println("enter the digit:");
        int digit = scn.nextInt();
       
        int counter = 0;

        while(num != 0){
            int digitToCheck = num % 10;
            if(digitToCheck == digit){
                counter ++;
            }
            num /= 10;
        }
        System.out.println("freq of "+ digit +" is " + counter);

        scn.close();
    }
}
