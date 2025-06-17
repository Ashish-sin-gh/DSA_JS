package patterns;

import java.util.Scanner;

public class digonalStar {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int num = scn.nextInt();

        for(int row = 0; row <= num; row ++ ){
            for(int col = 0; col <= row; col ++ ){
                if(row == col){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scn.close();
    }
}
