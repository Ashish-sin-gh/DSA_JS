// right angle triangle 

package patterns;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the triangle: ");
        int num = scn.nextInt();

        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
