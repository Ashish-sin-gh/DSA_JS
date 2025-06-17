import java.util.Scanner;

class CountDigitsInNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int count = 0;
        System.out.print("enter the number:");
        int div = scn.nextInt();

        while(div > 0){
            count++;
            div = div/10;
        }
        System.out.println("number of digits are: " + count);

        scn.close();
    }
}