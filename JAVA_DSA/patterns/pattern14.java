package patterns;

import java.util.Scanner;

public class pattern14 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("print the size: ");
        int num = scn.nextInt();

        for(int i = 0; i < num; i ++){
            int value = (int)(Math.pow(11, i));
            for(int j = 0; j <= i; j ++){
                int singleDigit = value % 10;
                value /= 10; 
                System.out.print(singleDigit + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}
