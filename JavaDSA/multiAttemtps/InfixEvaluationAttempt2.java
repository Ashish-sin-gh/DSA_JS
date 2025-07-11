package JavaDSA.multiAttemtps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluationAttempt2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the expression: ");
        String expression = br.readLine();

        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for(int i=0; i<expression.length();i++){
            char ch = expression.charAt(i);

            if(ch == '('){
                operatorStack.push(ch);

            }else if(Character.isDigit(ch)){
                operandStack.push(ch - '0');

            }else if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
                while(!operatorStack.isEmpty() && operatorStack.peek() != '(' && precedence(ch) <= precedence(operatorStack.peek())){
                    char operator = operatorStack.pop();
                    int operand1 = operandStack.pop();
                    int operand2 = operandStack.pop();

                    int calculatedValue = operation(operand2, operand1, operator);
                    operandStack.push(calculatedValue);
                }
                operatorStack.push(ch);

            }else if (ch == ')'){
                while(!operatorStack.isEmpty() && operatorStack.peek() != '('){
                    char operator = operatorStack.pop();
                    int operand1 = operandStack.pop();
                    int operand2 = operandStack.pop();

                    int calculatedValue = operation(operand2, operand1, operator);
                    operandStack.push(calculatedValue);
                }
                operatorStack.pop();
            }
        }

        while(!operatorStack.isEmpty()){
            char operator = operatorStack.pop();
            int operand1 = operandStack.pop();
            int operand2 = operandStack.pop();

            int calculatedValue = operation(operand2, operand1, operator);
            operandStack.push(calculatedValue);
        }

        System.out.println("final output is: " + operandStack.pop());
    }

    public static int precedence(char ch) {
        if(ch == '+' || ch == '-'){
            return 1;
        } else {
            return 2;
        }
    }

    public static int operation(int num1, int num2, char ch){
        if(ch == '+'){
            return num1+num2;
        } else if(ch == '-'){
            return num1-num2;
        } else if(ch == '*'){
            return num1*num2;
        } else {
            return num1/num2;
        }
    }
}
