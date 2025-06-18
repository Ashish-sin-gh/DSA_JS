/*
 *  push for opening bracket 
 *  pop for closing bracket 
 *  ignore rest everything 
 *  
 *  in the end 
 *  if stack empty - it is balanced 
 *  else - not balanced 
 */

package JavaDSA.Stack.balanceBracket;

import java.util.Stack;

public class BalanceBracketApproch2 {
    public static void main(String[] args) {
        String expression= "{[(a+b)+[(b+c)*(c+d)]}";

        Stack<Character> stackExp = new Stack<>();

        for(int index = 0; index < expression.length(); index++){
            char ch = expression.charAt(index);
            if(ch == '(' || ch == '{' || ch == '['){
                stackExp.push(ch);
            } 
            else if(ch == ')' || ch == '}' || ch == ']'){
                char top = stackExp.peek();
                
                if(ch == ')' && top == '(' 
                    || ch == '}' && top == '{' 
                    || ch == ']' && top == '['){
                        stackExp.pop();
                } else {
                    System.out.print(false);
                    return;
                }
            }
        }

        if(stackExp.size() == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
