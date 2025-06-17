package patterns;

import java.util.*;

public class diagonal3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = scn.nextInt();

        for(int row = 0; row < size; row ++){
            for(int col = 0; col < size; col ++){
                if(row == col || row == size - col - 1){
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
