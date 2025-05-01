package patterns;

import java.util.Scanner;

public class dimaond {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int num = scn.nextInt();

        int star = 1;
        int space = num / 2;

        for(int row = 1; row <= num; row ++){
            // print space
            for(int i = 1; i <= space; i++){
                System.out.print("  ");
            }

            // print star
            for(int i = 1; i <= star; i++){
                System.out.print("* ");
            }

            if(row <= num / 2){
                star += 2;
                space --;
            } else {
                star -= 2;
                space ++;
            }
            System.out.println();
        }

        scn.close();
    }
}
