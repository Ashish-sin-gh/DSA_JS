import java.util.Scanner;

public class digitOfNumbers {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = scn.nextInt();

        System.out.println("digits are: ");

        // find count 
        int count = 0;
        int numTemp = num;
        while(numTemp > 0){
            count ++ ;
            numTemp = numTemp / 10;
        }
        // System.out.println(count);

        // div by 10 -> rem * pow(10,count)
        int revNum = 0;
        while(num > 0){
            int rem = num % 10;
            revNum += rem * Math.pow(10, count-1);
            count --;
            num = num / 10;
        }
        // System.out.println(revNum);

        while(revNum > 0){
            int rem = revNum % 10;
            System.out.println(rem);
            revNum = revNum / 10;
        }
    
    }
}
