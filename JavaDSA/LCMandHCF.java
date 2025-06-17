/*
 * HCF => divide the numbers and the final divisor will be the HCF of these 2 number  
 * LCM * GCD = n1 * n2
 */

import java.util.Scanner;

public class LCMandHCF{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter 1st number:");
        int n1 = scn.nextInt();
        System.out.println("enter 2nd number:");
        int n2 = scn.nextInt();

        // HCF
        int divisor = 0;
        int divident = 0;

        if(n1 >= n2){
            divisor = n2;
            divident = n1;
        } else {
            divisor = n1;
            divident = n2;
        }

        while(divisor != 0){
            int rem = divident % divisor;
            divident = divisor;
            if(rem != 0){
                divisor = rem;
            } else {
                break;
            }
            // System.out.println(divisor);
        }

        //LCM
        int lcm = ( n1 * n2 )/ divisor;


        System.out.println("GCD : " + divisor + "\nLCM : " + lcm);

        scn.close();
    }
}