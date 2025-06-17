import java.util.*;

public class RotateNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = scn.nextInt();

        System.out.println("enter the key: ");
        int key = scn.nextInt();

        int place = 0;
        int tempNum = num;

        while(tempNum > 0){
            place++;
            tempNum /= 10;
        }
        if(key > place){
            key = key % place;
        }

        if(key >= 0){

            while(key > 0){
                int rem = num % 10;
                int numByTen = num / 10;
    
                num = numByTen + (rem * (int)Math.pow(10, place-1 ));  
    
                key--;
            }
        } 
        else {

            int divByNoOfZeros = (int)(Math.pow(10,place-1));
            while( key < 0){ 
                int div = num / divByNoOfZeros;
                num = ((num % divByNoOfZeros)* 10) + div;
                key ++;
            }
        }
        
        System.out.println("rotated number is: " + num);

        scn.close();
    }
}