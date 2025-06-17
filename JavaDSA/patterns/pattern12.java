package patterns;

import java.util.*;

public class pattern12 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("print the size: ");
        int num = scn.nextInt();

        int count1 = 0;
        int count2 = 1;
        int sum = 0;

        for(int row = 0; row < num; row ++){
            for(int col = 0; col <= row; col ++){
                System.out.print(count1 + " ");
                sum = count1 + count2;
                count1 = count2;
                count2 = sum;  
            }

            System.out.println();
        }

        scn.close();
    }
}
