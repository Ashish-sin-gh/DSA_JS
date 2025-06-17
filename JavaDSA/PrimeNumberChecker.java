// any number that want to get divided will get divided from a number btn 1 and 1quare root of that number or else it wont get divided.
/*
    if p*q = n
    then p < root n && q < root n 
    (i.e. both p and q cant be greater than root n) 
    (atleast one will be less than root n)
' */
import java.util.*;

class PrimeNumberChecker{

    public static String primeCheck(int num){
        if (num == 0 || num == 1){
            return "not prime";
        }
        for(int i = 2; i*i <= num; i++){
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

        scn.close();
    }
}