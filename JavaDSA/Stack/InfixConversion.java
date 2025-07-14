// convert infix expression to postfix and prefix expression

/*
 * infix - what human understand -> a + b - ( c * d ) / e + f;
 * prefix - what machine understand -> + + a b - / * c d e f
 * postfix - what machine understand -> a b + c d * e / - f +
*/
package JavaDSA.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixConversion{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the infix Expression: ");
        String infixExp = br.readLine();

        Stack<String> prefixStack = new Stack<>();
        Stack<String> postfixStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for(int i = 0; i < infixExp.length(); i ++){
            char ch = infixExp.charAt(i);

            if(ch == '('){
                operatorStack.push(ch);

            } else if(Character.isDigit(ch)){
                prefixStack.push(String.valueOf(ch));
                postfixStack.push(String.valueOf(ch));
                
            } else if(ch == ')'){
                while(!operatorStack.isEmpty() && operatorStack.peek() != '('){
                    conversionProcess(prefixStack, postfixStack, operatorStack);
                }
                operatorStack.pop();

            } else{
                while(!operatorStack.isEmpty() && operatorStack.peek() != '(' && precedence(ch) <= precedence(operatorStack.peek())){
                    conversionProcess(prefixStack, postfixStack, operatorStack);
                }
                operatorStack.push(ch);
            }
        }

        while(!operatorStack.isEmpty()){
            conversionProcess(prefixStack, postfixStack, operatorStack);
        }

        System.out.println("converted prefix exp: " + prefixStack.peek() );
        System.out.println("converted postfix exp: " + postfixStack.peek() );
    }

    public static int precedence(char ch) {
        return switch(ch){
            case '+' -> 1;
            case '-' -> 1;
            case '*' -> 2;
            default -> 2; 
        };
    }

    public static void conversionProcess(Stack<String> pre, Stack<String> post, Stack<Character> op){
         char operator = op.pop();
        // prefix
        String operand1OfPrefix = pre.pop();
        String operand2OfPrefix = pre.pop();
        String result1 = operator + operand2OfPrefix + operand1OfPrefix;
        pre.push(result1);
        // postfix
        String operand1OfPostfix = post.pop();
        String operand2OfPostfix = post.pop();
        String result2 = operand2OfPostfix + operand1OfPostfix + operator; 
        post.push(result2);
    }

}

