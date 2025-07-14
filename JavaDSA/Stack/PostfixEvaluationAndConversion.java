package JavaDSA.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixEvaluationAndConversion{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the infix Expression: ");
        String postfixExp = br.readLine();

        Stack<String> prefixStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();
        Stack<Integer> evaluationPostStack = new Stack<>();

        for(int i = 0; i < postfixExp.length(); i ++){
            char ch = postfixExp.charAt(i);

            if(Character.isDigit(ch)){
                prefixStack.push(Character.toString(ch));
                infixStack.push(Character.toString(ch));
                evaluationPostStack.push(Integer.parseInt(Character.toString(ch)));

            } else if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
                // evaluation stack
                int num2 = evaluationPostStack.pop();
                int num1 = evaluationPostStack.pop();
                int calculatedValue = operation(num1, num2, ch);
                evaluationPostStack.push(calculatedValue);

                // conversion to infix
                String si2 = infixStack.pop(); 
                String si1 = infixStack.pop();
                String convertedinfix = "(" + si1 + ch + si2 + ")";
                infixStack.push(convertedinfix);
                
                // conversion to prefix
                String sp2 = prefixStack.pop();
                String sp1 = prefixStack.pop();
                String convertedprefix = ch + sp1 + sp2;
                prefixStack.push(convertedprefix);
            }
        }

        System.out.println("evaluated postfix - " + evaluationPostStack.peek());
        System.out.println("converted prefix - " + prefixStack.peek());
        System.out.println("converted infix - " + infixStack.peek());

    }

     public static int operation(int num1, int num2, char operand){
        return switch(operand){
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '/' -> num1 / num2;
            case '*' -> num1 * num2;
            default -> 0;
        };
    }
}
