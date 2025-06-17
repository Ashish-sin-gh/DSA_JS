package numberSystem;

import java.util.*;

public class anyBaseToAnyBase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int orignalNum = scn.nextInt();
        System.out.println("enter the base to covert from: ");
        int baseFrom = scn.nextInt();
        System.out.println("enter the base to covert to: ");
        int baseTo = scn.nextInt();

        int i = 0;
        int newNum = 0;

        while(orignalNum != 0){
            int rem = orignalNum % baseTo;
            newNum += rem * (Math.pow(baseFrom, i)); 
            i++;
            orignalNum /= baseTo;
        }
        System.out.println(orignalNum + " in base " + baseFrom + " to base " + baseTo + " is: " + newNum);
    
        scn.close();
    }
}
