/*
 * Stock span - it is the number of days passed btn current stock and the previous higher stock compared to current stock.
 * 
 * if no higher stock before current stock then its span will be same as the of days passed (no of elements from start of the array to current stock)
 * 
 *                          | 
 *              |           |
 *              |       |   |
 *          |   |   |   |   |
 *      |   |   |   |   |   |
 *   ___|___|___|___|___|___|   
 *      1   2   3   1   2   6
 * 
 *  NEXT GREATEST ELEMENT TO THE LEFT with some modification 
 *  if no next greater element on the left - span will always be (index+1) 
 */     

package JavaDSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Stack<Integer> st = new Stack<>();
        System.out.println("enter the days stock performed: ");
        int size = scn.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("enter the stock value for each day: ");
        for(int i = 0 ; i < size; i ++){
            arr[i] = scn.nextInt();
        }
        
        int[] arrAnswer = new int[arr.length];

        // find next greatest element on the left

        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                // st.push(arr[i]);
                arrAnswer[i] = i + 1;
            } else {
                while(!st.isEmpty() && arr[i] >= arr[st.peek()]){
                    st.pop();                
                }
                if(!st.isEmpty()){
                    arrAnswer[i] = i - st.peek();
                } else {
                    arrAnswer[i] = i + 1;
                }
            }
            st.push(i);
        }

        for(int i = 0; i < arrAnswer.length; i ++){
            System.out.println("the stock span for " + (i + 1)  + " day with stock of " + arr[i ] + " is " + arrAnswer[i]) ;
        }

        scn.close();

    }
}