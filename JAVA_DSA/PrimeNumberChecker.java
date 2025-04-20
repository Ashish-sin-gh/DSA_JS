import java.util.*;

class PrimeNumberChecker{

    public static String primeCheck(int num){
        if (num == 0 || num == 1){
            return "not prime";
        }
        for(int i = 2; i<=num/2; i++){
            if(num%i == 0 ){
                return "not prime";
            } 
        }
        return "is prime";
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = scn.nextInt();

        

        System.out.println(primeCheck(num));
    }
}