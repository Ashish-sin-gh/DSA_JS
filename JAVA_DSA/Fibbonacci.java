import java.util.*;

public class Fibbonacci {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the upper range");
        int num = scn.nextInt();
        int first = 0;
        int second = 1;
        int sum = 0;

        System.out.println("output is: ");
        
        for(int i=1; i<=num; i++){
            System.out.println(first);
            sum = first + second;
            first = second;
            second = sum;
            // System.out.println(sum);
        }
        scn.close();
    }
}
