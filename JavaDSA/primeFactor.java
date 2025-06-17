import java.util.*;

public class primeFactor {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = scn.nextInt();

        // looping through the prime number
        for(int i = 2; i * i <= num; i++){
            // diving the number by prime no and printing the divisor
            while(num % i == 0){
                num /= i;
                System.out.println(i);
            }
        }

        // special case -  when one factor is above root num 
        // eg- factor of 46 is 2 and 23 and the above loop wont go till 23 
        // as 4 * 4 = 16 and 5 * 5 = 25, loop wont search after 4 
        if(num != 1){
            System.out.println(num);
        }  

        scn.close();
    }
    
}
