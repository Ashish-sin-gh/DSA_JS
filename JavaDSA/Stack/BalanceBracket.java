package JavaDSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String expression = scn.nextLine();
        
        Stack<Character> expressionStack = new Stack<>();
        
        for(int idx = 0; idx < expression.length(); idx++){
            char ch = expression.charAt(idx);

            if(ch != ')' && ch != ']' && ch != '}' ){
                expressionStack.push(ch);
            } 
            else if(ch == ')') {
                while(expressionStack.peek() != '('){
                    char top = expressionStack.peek();
                    if(top == '{' || top == '['){
                        System.out.println(false);
                        return;
                    } 
                    expressionStack.pop();
                }
                expressionStack.pop();
            }
            else if(ch == ']') {
                while(expressionStack.peek() != '['){
                    char top = expressionStack.peek();
                    if(top == '{' || top == ')'){
                        System.out.println(false);
                        return;
                    } 
                    expressionStack.pop();
                }
                expressionStack.pop();
            } 
            else if(ch == '}') {
                while(expressionStack.peek() != '}'){
                    char top = expressionStack.peek();
                    if(top == '(' || top == '['){
                        System.out.println(false);
                        return;
                    } 
                    expressionStack.pop();
                }
                expressionStack.pop();
            }
        }

        if(expressionStack.size() == 0){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

        scn.close();
    }
}
