package JavaDSA.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of people in the party: ");
        int noOfPeople = Integer.parseInt(br.readLine());

        int[][] acquaintanceArray = new int[noOfPeople][noOfPeople];

        for(int i = 0; i < noOfPeople; i++){
            System.out.println("enter friendship status:");
            String line = br.readLine();

            for(int j = 0; j < noOfPeople; j++){
                acquaintanceArray[i][j] = line.charAt(j) - '0';
            }
        }

        Stack<Integer> possibleCelebrityStack = new Stack<>();

        for(int i = 0; i < noOfPeople; i++){
            possibleCelebrityStack.push(i);
        }

        while(possibleCelebrityStack.size() >= 2){
            int person1 = possibleCelebrityStack.pop();
            int person2 = possibleCelebrityStack.pop();

            if(acquaintanceArray[person1][person2] == 1){
                possibleCelebrityStack.push(person2);
            } else {
                possibleCelebrityStack.push(person1);
            }
        }

        if(!possibleCelebrityStack.isEmpty()){
            int potentialCelebrity = possibleCelebrityStack.pop();

            for(int i = 0; i < noOfPeople; i ++){
                if(i != potentialCelebrity ){
                    if(acquaintanceArray[potentialCelebrity][i] != 0 || acquaintanceArray[i][potentialCelebrity] != 1){
                        potentialCelebrity = -1;
                        return;
                    }
                }    
            }

            if(potentialCelebrity == -1){
                System.out.println("no celebrity in the party");
            } else {
                System.out.println("celebrity is: " + potentialCelebrity);
            }
        }
    }
}
