package JavaDSA.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SmallestNumberFollowingPattern{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the alphabet pattern: ");
        String line = br.readLine();

        Stack<Character> alphabetPatternStack = new Stack<>();
        Stack<Integer> numPatternStack = new Stack<>();
        Stack<Integer> finalNumPatternStack = new Stack<>();

        int count = 1;

        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);

            if(ch == 'd'){
                alphabetPatternStack.push(ch);
                count++;
            }
            
            if(ch == 'i'){
                int num = count;
                while(!alphabetPatternStack.isEmpty() && alphabetPatternStack.peek() != 'i'){
                    alphabetPatternStack.pop();
                    numPatternStack.push(num);
                    num--;
                }
                numPatternStack.push(num);
                count++;
            }
        }

        int num = count;
        while(!alphabetPatternStack.isEmpty()){
            alphabetPatternStack.pop();
            numPatternStack.push(num);
            num--;
        }
        numPatternStack.push(num);

         while(!numPatternStack.isEmpty()){
            finalNumPatternStack.push(numPatternStack.pop());
        }

        while(!finalNumPatternStack.isEmpty()){
            System.out.println(finalNumPatternStack.pop());
        }
    }
}