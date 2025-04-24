import java.util.*;

public class RotationOfNumberWay2 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("enter the number: ");
        int num = scn.nextInt();

        System.out.println("enter the number: ");
        int key = scn.nextInt();

        // find number of digit
        int numOfDigit = 0;
        int tempNum = num; 
        while(tempNum > 0){
            numOfDigit ++;
            tempNum /= 10;
        }

        // rotate the digit
        int into10left = 1;
        int into10right = 1;
        for(int i = 0; i< numOfDigit; i++){
            if(i < key){
                into10right *= 10; 
            } else {
                into10left *= 10;
            }
        }

        int div = num / into10right;
        int rem = num % into10right;

        int op = rem * into10left + div;

        System.out.println("op is: " + op);




        scn.close();
    }
}
