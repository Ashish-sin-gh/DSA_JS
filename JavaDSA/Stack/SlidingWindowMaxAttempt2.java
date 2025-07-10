package JavaDSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMaxAttempt2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("enter the size of array: ");
        int size = scn.nextInt();
        
        int[] arr = new int[size];
        
        System.out.print("enter element: ");
        for(int i = 0; i < size; i++){
            arr[i] = scn.nextInt(); 
        }

        System.out.print("enter the window size: ");
        int windowSize = scn.nextInt();

        // find NGETR
        Stack<Integer> st = new Stack<>();
        int[] ngetr = new int[size];

        for(int i = arr.length-1; i >= 0 ; i--){
            if(i == arr.length - 1){
                st.push(i);
                ngetr[i] = arr.length;
            } else {
                // pop,  answer , push
                    while(!st.isEmpty() && arr[i] >= arr[st.peek()]){
                        st.pop();
                    }
                    if(st.isEmpty()){
                        ngetr[i] = arr.length;
                    } else {
                        ngetr[i] = st.peek();
                    }
                    st.push(i);
            }
        }

        // check ngetr against window size
        System.out.println("output is: ");
        for(int i = 0; i <= ngetr.length - windowSize; i++){
            int ngetrJump = i;
            while(ngetr[ngetrJump] < i + windowSize){
                ngetrJump = ngetr[ngetrJump];
            }

            System.out.println(arr[ngetrJump]);
        }   
    }
}
