package patterns;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = scn.nextInt();

        int space = -3;
        for(int i = 1; i <= size; i++){
            space = space + 2;
        }
        
        if(space < 0){
            space = 0;
        }
        // System.out.println(space);
        
        int number = 1;
        for(int row = 1; row <= size; row ++){
            int counter1 = 1;
            int counter2 = row;
            // number printer
            for(int col = 1; col <= number; col ++){
                System.err.print(counter1 + "\t");
                counter1 ++;
            }

            //space printer
            for(int col = 1; col <= space; col ++){
                System.out.print("\t");
            }
            
            // number printer
            for(int col = 1; col <= number; col ++){
                if( counter2 < size){
                    System.out.print(counter2 + "\t");
                }
                counter2 --;
            }

            space -= 2;
            number ++;

            System.out.println();
        }

        scn.close();

    }
}
