import java.util.*;

public class InverseOfNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = scn.nextInt();

        int oldIndex = 0;
        int newDigit = 0;

        while(num > 0){
            int rem = num % 10;
            oldIndex ++;
            newDigit += oldIndex * (int)Math.pow(10, rem-1);
            num = num / 10;
        }

        System.out.println("inverse is: " + newDigit);
    }
}