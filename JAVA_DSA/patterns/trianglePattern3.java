package patterns;

import java.util.Scanner;

public class trianglePattern3 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int num = scn.nextInt();

        for(int row = 1; row <= num; row++){
            // space print
            for(int space = 1; space <= num - row; space++){
                System.out.print("  ");
            }
            for(int star = 1; star <= row; star++){
                System.out.print("* ");
            }
            System.out.println();
        }

        scn.close();
    }
}
