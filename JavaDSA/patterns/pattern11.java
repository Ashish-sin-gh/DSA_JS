package patterns;

import java.util.*;

public class pattern11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("print the size: ");
        int num = scn.nextInt();

        int count = 1;

        for(int row = 0; row < num; row ++){
            for(int col = 0; col < row; col ++){
                System.out.print(count + " ");
                count ++;
            }

            System.out.println();
        }

        scn.close();
    }
}
