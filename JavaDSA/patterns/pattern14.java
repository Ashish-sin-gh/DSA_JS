/*
 *  nCr = (n! / ((n-r)! * r!))
 * 
 *  nCk+1 = (nCk * (n-k)) / (k+1) 
 * 
 * you can slove using both the formula 
 * 
 *  1
 *  1   1
 *  1   2   1
 *  1   3   3   1
 *  1   4   6   4   1
 *  1   5   10  10  5   1
 */


package patterns;

import java.util.Scanner;

public class pattern14 {

    public static int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("print the size: ");
        int num = scn.nextInt();

        // System.out.println(factorial(num));
        for(int i = 0; i < num; i ++){
            for(int j = 0; j <= i; j ++){
                int combination = factorial(i) / (factorial(i-j)* factorial(j));
                System.out.print(combination + "\t");
            }
            System.out.println();
        }

        scn.close();
    }
}
