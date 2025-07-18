package JavaDSA.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PrefixEvaluationAndConversion {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter prefix expression - ");
        String prefixExpression = br.readLine();

        Stack<Integer> evaluatePrefixStack = new Stack<>();
        Stack<String> postfixStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();


        for(int i = prefixExpression.length()-1 ; i >= 0; i --){
            char ch = prefixExpression.charAt(i);

            if(Character.isDigit(ch)){
                evaluatePrefixStack.push(ch - '0');
                postfixStack.push(Character.toString(ch));
                infixStack.push(Character.toString(ch));
            
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                // evaluation
                int preNum1 = evaluatePrefixStack.pop(); 
                int preNum2 = evaluatePrefixStack.pop();
                int answer = calculation(preNum1, preNum2, ch);
                evaluatePrefixStack.push(answer);
                // postfix 
                String postNum1 = postfixStack.pop();
                String postNum2 = postfixStack.pop();
                String postfix = postNum1 + postNum2 + ch;
                postfixStack.push(postfix);
                // infix 
                String inNum1 = infixStack.pop();
                String inNum2 = infixStack.pop();
                String infix = "(" + inNum1 + ch + inNum2 + ")";
                infixStack.push(infix);
            }
        }

        System.out.println("Prefix evaluation - " + evaluatePrefixStack.peek());
        System.out.println("Infix converted - " + infixStack.peek());
        System.out.println("postfix converted - " + postfixStack.peek());
    }

    public static int calculation(int n1, int n2, char operator){
        return switch(operator){
            case '+' -> n1 + n2;
            case '-' -> n1 - n2;
            case '/' -> n1 / n2;
            case '*' -> n1 * n2;
            default -> 0;
        };
    }
}
