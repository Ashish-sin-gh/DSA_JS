package Stack;

import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMax {
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

        int[] resArr = new int[size - windowSize + 1];
        int maxInWindow = Integer.MIN_VALUE;

        int lb = 0;
        int ub = windowSize - 1;

        Stack<Integer> st = new Stack<>();
        int[] nge = new int[size];

        // next greatest element to the right - find
        for(int i = arr.length - 1; i >= 0; i--){
            if(i == arr.length - 1){
                st.push(i);
                nge[arr.length - 1] = arr.length;
            } else {
                while(!st.isEmpty() && arr[i] >= arr[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    nge[i] = arr.length;
                } else {
                    nge[i] = st.peek();
                }
                st.push(i);
            }
        }

        for(int i = 0; i <= size - windowSize; i++){
            int j = i;
            while(nge[j] < i + windowSize){
                j = nge[j];
            }
            System.out.println(arr[j]);
        }
    }
}
