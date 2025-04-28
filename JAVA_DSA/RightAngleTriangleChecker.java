// if h2 = b2 + p2 then it is a right angle triangle 
import java.util.*;

public class RightAngleTriangleChecker {

    public static boolean checkRightTriangle(int a,int b, int c){
        return a * a == b * b + c * c;
    }
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter 3 numbers: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        // check for the biggest number
        int max = num1;
        if(num2 >= max){
            max = num2;
        } 
        if(num3 >= max){
            max = num3;
        }

        if(max == num1){
            boolean triangle = checkRightTriangle(max, num2, num3);
            System.out.println(triangle);
        } else if(max == num2){
            boolean triangle = checkRightTriangle(max, num2, num3);
            System.out.println(triangle);
        } else {
            boolean triangle = checkRightTriangle(max, num2, num3);
            System.out.println(triangle);
        }


        scn.close();
    }
}
