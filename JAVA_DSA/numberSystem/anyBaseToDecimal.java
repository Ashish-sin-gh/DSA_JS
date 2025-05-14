package numberSystem;

import java.util.*;

public class anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int bNum = scn.nextInt();
        System.out.println("enter the base to covert from: ");
        int base = scn.nextInt();

        int cNum = 0;
        int i = 0;

        while(bNum != 0){
            int rem = bNum % 10;
            cNum += rem * (Math.pow(base, i));
            i ++;
            bNum /= 10;
        }

        System.out.println("the number " + bNum + " from base " + base + " to decimal is: " + cNum );
    }
}
