package patterns;

import java.util.Scanner;

public class Wpattern {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = scn.nextInt();


        for(int i = 1; i <= size; i++){
            if(i < size / 2 + 1 || i == size){
                for(int j = 1; j <= size; j++){
                    if(j == 1 || j == size){
                        System.out.print("*  ");
                    } else{
                        System.out.print("   ");
                    }
                }
            } else {
                for(int j = 1; j <= size; j ++){
                    if(j == 1 || j == size || i == j || i+j == size+1){
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }

        scn.nextInt();
    }
}
