package patterns;

import java.util.Scanner;

public class Swastik {
    public static void main (String[] args){
         Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = scn.nextInt();

        for(int i= 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                // i == 1
                if(i == 1){
                    if (j <= size/2+1 || j == size){
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                } else if(i > 1 && i < size/2 + 1){
                    if (j == size/2+1 || j == size){
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                } else if(i == size/2 + 1){
                     System.out.print("*  ");

                } else if(i > size/2 + 1 && i < size){
                    if (j == size/2+1 || j == 1){
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                } else{
                    if (j >= size/2+1 || j == 1){
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }

        scn.close();
    }
}
