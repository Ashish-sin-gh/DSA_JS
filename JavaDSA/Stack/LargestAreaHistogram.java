/*
 *  the best way to slove this in O(n) is to find each elements Next smallest element to the left and right and 
 */


package JavaDSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram{
    // public int nsbtl(int element, int[] arr, Stack<Integer> st){
    //     while(!st.isEmpty() && element <= st)
    // } 
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        System.out.println("enter the number of bars: ");
        int size = scn.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("enter the height of the each bar: ");
        for(int i = 0 ; i < size; i ++){
            arr[i] = scn.nextInt();
        }
        
        int[] arrLeftNextSmallAnswer = new int[arr.length];
        int[] arrRightNextSmallAnswer = new int[arr.length];
        int[] arrFinalAnswer = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            // NSETL
            if(i == 0){
                st1.push(i);
                arrLeftNextSmallAnswer[i] = -1;
            } else {
                while(!st1.empty() && arr[i] <= arr[st1.peek()]){
                    st1.pop();
                }

                if(st1.empty()){
                    arrLeftNextSmallAnswer[i] = -1;
                } else {
                    arrLeftNextSmallAnswer[i] = st1.peek();
                }
                st1.push(i);
            }
            // NSETR
            while(!st2.empty() && arr[i] <= arr[st2.peek()]){
                arrRightNextSmallAnswer[st2.peek()] = i;
                st2.pop();
            }
            st2.push(i);
        }
        while(!st2.empty()){
            arrRightNextSmallAnswer[st2.peek()] = arr.length;
            st2.pop(); 
        }

        int maxArea = 0;

        for(int i = 0; i <= arrFinalAnswer.length - 1; i++){
            int width = arrRightNextSmallAnswer[i] - arrLeftNextSmallAnswer[i] - 1;
            int area = width * arr[i];
            
            if(area > maxArea){
                maxArea = area;
            }
        }

        System.out.println("Largest area is : " + maxArea);

        scn.close();
    }
}