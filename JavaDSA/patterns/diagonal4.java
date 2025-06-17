package patterns;

import java.util.Scanner;

public class diagonal4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = scn.nextInt();
        
        
        /*
        
        TRIED and FAILED APPROACH 
        
        int div = size / 2 + 1;
        for(int row = 1; row <= size; row ++){
            for(int col = 1; col <= size; col ++){
                if(row <= div && col <= div){
                    if(row == size - col - 1){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if(row <= div &&  col > div){
                    // System.out.println("djf");   
                    if(col - row == 2){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if(row > div && col <= div){
                    // System.out.println("dfdf");
                    if(row - col == 2){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }  
            System.out.println();     
        }

        */

        //  correct approach

        int innerSpace = -1;
        int outerSpace = size / 2;

        for(int row = 1; row <= size; row ++){
            // outer space
            for(int col = 1; col <= outerSpace; col ++){
                System.out.print("  ");
            }

            // star
            System.out.print("* ");

            // inner space
            for(int col = 1; col <= innerSpace; col ++){
                System.out.print("  ");
            }

            // star
            if(!(row == 1 || row == size)){
                System.out.print("*  ");
            }

            // update statement
            if(row < 3 ){
                outerSpace --;
                innerSpace += 2;
            } else {
                outerSpace ++;
                innerSpace -= 2;
            }

            System.out.println();
        }

        scn.close();
    }
}
