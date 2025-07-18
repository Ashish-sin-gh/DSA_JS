package JavaDSA.multiAttemtps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of people in the party: ");
        int size = Integer.parseInt(br.readLine());

        int[][] arr = new int[size][size];

        for(int i = 0; i < size; i++){
            System.out.println("enter the status (1 or 0): ");
            String line = br.readLine();

            for(int j = 0; j < size; j++){
                arr[i][j] = line.charAt(i) - '0';
            }
        }

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < size; i++){
            st.push(i);
        }

        while(st.size() != 1){
            int p1 = st.pop();
            int p2 = st.pop();

            if(arr[p1][p2] == 1){
                st.push(p2);
            } else {
                st.push(p1);
            }
        }

        int pc = st.pop(); // what every is at the peek of the stack is the potential celebrity

        // check if the element is a celebrity or not
        for(int i = 0; i < size; i++){
            if(pc != i){
                if(arr[i][pc] != 1 || arr[pc][i] != 0){
                    System.out.println("no celebrity");
                    return;
                }
            }
        }
        System.out.println("celebrity is: " + pc);
    }
}
