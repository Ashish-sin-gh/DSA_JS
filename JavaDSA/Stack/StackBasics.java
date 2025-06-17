/*
 * stack is a dataStructure like we have array, ArrayList, String
 * stack is always Last In First Out (LIFO)
 * 
 * operations/ methods in stack -
 *      push() - "add" to stack
 *      pop() - "remove" from stack 
 *      peek() - get the "top" element in the stack
 *      size() - get the size of the stack
 */
package JavaDSA.Stack;

import java.util.*;

 public class StackBasics{
    public static void main(String[] args) {
        Stack<Integer> st; // decaration 
        st = new Stack<Integer>(); // initilization

        st.push(10);
        st.push(40);
        st.push(60);
        st.push(80);
        st.push(10);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.size());
    }
 }