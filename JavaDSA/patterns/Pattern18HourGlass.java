package patterns;

import java.util.Scanner;

public class Pattern18HourGlass {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int num = scn.nextInt();
        
        int space = 0;
        int star = num;

        for(int row = 1; row <= num; row ++){
            
            // print space
            for(int col = 1; col <= space; col ++){
                System.out.print("  ");
            }

            // print star
            for(int col = 1; col <= star; col ++){
                if(row > 1 && row < num / 2 + 1 && col > 1 && col < star){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }

            if(row <= num/2){
                space ++;
                star -= 2; 
            } else{
                space --;
                star += 2;
            }
            System.out.println();
        }

        scn.close();
    }
}
