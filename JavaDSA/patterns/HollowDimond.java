package patterns;

import java.util.Scanner;

public class HollowDimond {
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int num = scn.nextInt();

        int star1 = (num / 2) + 1;
        // int star2 = (num / 2) + 1;
        int space = 1;

        for(int row = 1; row <= num; row++){
            // print star1
            for(int i = 1; i <= star1; i++){
                System.out.print("* ");
            }
            
            // print space
            for(int i = 1; i <= space; i++){
                System.out.print("  ");

            }

            // print star2
            for(int i = 1; i <= star1; i++){
                System.out.print("* ");
            }

            if(row <= num / 2){
                space += 2;
                star1--;
            } else {
                space -= 2;
                star1++;
            }

            System.out.println();
        }   


        scn.close();
    }
}
