import java.util.*;

class PrintAllPrimes{
    public static void printPrime(int low,int high){
        for(int i = low; i <= high; i++){
            boolean isPrime = true;
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                } 
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        printPrime(low, high);
        scn.close();
    }
}