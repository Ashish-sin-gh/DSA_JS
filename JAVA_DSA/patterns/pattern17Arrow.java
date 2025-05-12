package patterns;

import java.util.Scanner;

public class pattern17Arrow {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = scn.nextInt();

        int space = size/2;
        int star = 1;

        for(int row = 1; row <= size; row ++){
            // print space
            for(int col = 1; col <= space; col ++){
                if(row == size / 2 + 1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            // print star
            for(int col = 1; col <= star; col ++){
                System.out.print("*\t");
            }

            if(row <= size / 2){
                star ++;
            } else {
                star --;
            }

            System.out.println();
        }
    }
}
