package patterns;

import java.util.Scanner;

public class pattern15revision{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int num = scn.nextInt();

        int space = num/2;
        int number = 1;

        for(int row = 1; row <= num; row ++ ){
            int counter = row <= num/2+1 ? row : num%row+1;  
            //  print space
            for(int col = 1; col <= space; col ++){
                System.out.print("  ");
            }
            // print number
            for(int col = 1; col <= number; col ++){
                System.out.print( counter +" ");
                if(col <= number/2){
                    counter++;
                } else {
                    counter--;
                }
            }

            if(row <= num/2){
                space--;
                number +=2;
            } else {
                space++;
                number -= 2;
            }

            System.out.println();
        }
        
        scn.close();
    }
}