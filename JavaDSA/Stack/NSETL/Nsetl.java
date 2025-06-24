// next smallest element to the left 

/*
 * work from start of the array
 */

package JavaDSA.Stack.NSETL;

import java.util.Scanner;
import java.util.Stack;

public class Nsetl {
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

        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                arrAnswer[i] = -1;
            } else {
                while(!st.isEmpty() && arr[i] <= st.peek()){
                    st.pop();
                }

                if(st.isEmpty()){
                    arrAnswer[i] = -1;
                } else {
                    arrAnswer[i] = st.peek();
                }
            }

            st.push(arr[i]);
        }

         for(int i = 0; i < arrAnswer.length; i++){
            System.out.println("next greater for " + arr[i] + " is " + arrAnswer[i]);
        }

        scn.close();
    }
}
