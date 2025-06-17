package JavaDSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class duplicateBracketProbem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();

       // (a+b)+ ((c+d))    // true - it has dublicates
       // ((a+b)+(c+d))     // false - no dublicates

       for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) != ')'){
            st.push(str.charAt(i));
        } else {
            if(st.peek() == '('){
                System.out.println(true);
                return;
            } else{
                do{
                st.pop();
                } while(st.peek() != '(');
            }
        }
    }
    System.out.println(false);
    scn.close();
    }
}
