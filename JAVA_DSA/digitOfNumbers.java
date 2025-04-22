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
            // System.out.println(numTemp);
        }
        System.out.println(count);

        // div by 10 -> rem * pow(10,count)
        // number reversed?
        int div = (int)Math.pow(10, count-1); 

        while(div > 0){
            int rem = num / div;
            System.out.println(rem);
            num = num % div;
            div = div / 10;
        }
    
    }
}
