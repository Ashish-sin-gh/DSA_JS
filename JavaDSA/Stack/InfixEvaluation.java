package JavaDSA.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluation{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the exception: ");
        String expression = br.readLine();

        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == '('){
                operatorStack.push(ch);

            } else if( ch == ')'){
                while(!operatorStack.isEmpty() && operatorStack.peek() != '('){
                    char operator = operatorStack.pop();
                    int num2 = operandStack.pop();
                    int num1 = operandStack.pop();
                    
                    int result = operation(num1, num2, operator);
                    operandStack.push(result);
                }
                operatorStack.pop();

            } else if(Character.isDigit(ch)){
                operandStack.push(ch - '0');

            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(!operatorStack.isEmpty() && operatorStack.peek() != '(' && precedence(ch) <= precedence(operatorStack.peek())){
                    char operator = operatorStack.pop();     
                    int num2 = operandStack.pop();
                    int num1 = operandStack.pop();

                    int result = operation(num1, num2, operator);
                    operandStack.push(result);
                }
                operatorStack.push(ch);
            }
        }
        while(!operatorStack.isEmpty()){
            char operator = operatorStack.pop(); 
            int num2 = operandStack.pop();     
            int num1 = operandStack.pop();
                   
            int result = operation(num1, num2, operator);
            operandStack.push(result);
        }

        System.out.println("output is - " + operandStack.peek());
    }

    public static int precedence(char operator){
        if(operator == '+' || operator == '-'){
            return 1;
        } else if(operator == '/' || operator == '*'){
            return 2;
        } else {
            return 0;
        }
    }

    public static int operation(int n1, int n2, char operator){
        if( operator == '+'){
            return n1+n2;
        } else if(operator == '-'){
            return n1-n2;
        } else if(operator == '*'){
            return n1*n2;
        } else if(operator == '/'){
            return n1/n2;
        } else {
            return -1;
        }
    }
}
