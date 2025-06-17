package numberSystem;

import java.util.*;

public class decimalToBinary{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the decimal number: ");
        int dNum = scn.nextInt();
        System.out.println("enter the base for conversion (2, 8, 10): ");
        int base = scn.nextInt();

        int convertedNum = 0;
        int i = 0;
        while(dNum != 0){
            int rem = dNum % base;
            convertedNum += rem * Math.pow(10, i);
            i++;
            dNum /= base;
        }

        System.out.println("coverted number from base 10 to base "+ base + " is: "+ convertedNum);

        scn.close();
    }
}