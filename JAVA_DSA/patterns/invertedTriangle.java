package patterns;

import java.util.Scanner;

public class invertedTriangle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int num = scn.nextInt();

        for(int row = num; row >= 1; row --){
            for(int col = 1; col <= row; col ++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scn.close();
    }
}
