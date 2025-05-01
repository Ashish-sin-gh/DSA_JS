package patterns;

import java.util.Scanner;

public class trianglePattern4 {
    public static void main(String[] args){
         Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int num = scn.nextInt();

        for(int row = 1; row <= num; row++){
            // spaces
            for(int col = 1; col <= row - 1; col++){
                System.out.print("  ");
            }

            // star
            for(int col = 1; col <= num - row; col ++){
                System.out.print("* ");
            }

            System.out.println();
        }

        scn.close();
    }
}
