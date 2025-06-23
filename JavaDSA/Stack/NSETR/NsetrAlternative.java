package JavaDSA.Stack.NSETR;

import java.util.Scanner;
import java.util.Stack;

public class NsetrAlternative {
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

        for(int i = 1; i < arr.length; i ++){
            while(!st.empty() && arr[i] < arr[st.peek()]){
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
