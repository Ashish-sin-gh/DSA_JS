package patterns;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("print the size: ");
        int num = scn.nextInt();

        for(int i = 1; i <= 10; i ++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        scn.close();
    }
}
