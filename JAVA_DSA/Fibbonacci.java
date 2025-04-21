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
        System.out.println(first);
        System.out.println(second);

        for(int i=3; i<=num; i++){
            sum = first + second;
            first = second;
            second = sum;
            System.out.println(sum);
        }
    }
}
