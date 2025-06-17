package patterns;

import java.util.Scanner;

public class pattern15{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = scn.nextInt();

        int space = size / 2;
        int number = 1;
        
        for(int row = 1; row <= size; row ++){  
            int count = row <= size / 2 + 1 ? row : size % row + 1 ;
            // print space
            for(int col = 1; col <= space; col ++){
                System.out.print("  ");
            } 
            // print number
            for(int col = 1; col <= number; col ++){
                System.out.print(count + " ");
                 // update statement for counter
                if(col <= number / 2 ){
                    count ++;
                } else {
                    count --;       
                }
            }
            // update statement for space and number occurence in a row
            if(row <= size / 2){
                space --;
                number += 2;
            } else {
                space ++;
                number -= 2;
            }
            System.out.println();
        }

        scn.close();
    }
}