// Specifically, bulb number k is toggled once for each of its divisors(factors). 

// Therefore, the total number of toggles for bulb k equals the number of divisors of k.​

// A key observation is that only perfect squares have an odd number of divisors. 
// This is because divisors typically come in pairs (e.g., for 12: (1,12), (2,6), (3,4)), but in the case of a perfect square like 9, one of the divisors (3) is repeated, resulting in an odd count.

import java.util.*;

public class BenjaminBulbs{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number of bulbs: ");
        int noOfBulbs = scn.nextInt();

        System.out.println("\nbulbs that will lit up: ");
        for(int i = 1; i * i <= noOfBulbs; i++){
            System.out.print(i*i + "  ");
        }


        scn.close();
    }
}