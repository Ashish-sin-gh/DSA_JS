/*
 * next greatest number to the right - alternative approch 
 * in this approch we will run the loop from start of the array 
 * and every number will pop the number less than itself and to its left and replace itself with that number 
 * 
 * note - dont put value in the stack - put the index of that value form array
 * - we are doing this to slove the issue that we will face while pushing greater number to the resultant array against their smaller number
 */

package JavaDSA.Stack.NGETR;

import java.util.Scanner;
import java.util.Stack;

public class NgetrAlternative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Stack<Integer> st = new Stack<>();
        System.out.println("enter the size of the array");
        int size = scn.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("enter the value for the array");
        for(int i = 0 ; i < size; i ++){
            arr[i] = scn.nextInt();
        }
        
        int[] arrAnswer = new int[arr.length];

        st.push(0);

        for(int i = 1; i < size; i++){
            while( !st.isEmpty() && arr[i] > arr[st.peek()]){
                arrAnswer[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            arrAnswer[st.peek()] = -1;
            st.pop();
        }

        for(int i = 0; i < arrAnswer.length; i ++){
            System.out.println("next greatest number to the is right of " + arr[i] + " is "+ arrAnswer[i]) ;
        }

        scn.close();
    }
}
