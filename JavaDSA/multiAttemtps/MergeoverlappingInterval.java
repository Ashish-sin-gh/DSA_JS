package JavaDSA.multiAttemtps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeoverlappingInterval {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try{
            n = Integer.parseInt(br.readLine());
        } catch(IOException e) {
            System.out.println("data not correctly formatted");
            e.printStackTrace();
        }

        // int[][] meetingTimingArray = new int[n][2];
        Pair[] pairs = new Pair[n];
        
        for(int i = 0; i < n; i++){
            String line = br.readLine();
            String[] splittedLine = line.split(" ");
            // meetingTimingArray[i][0] ;
            // meetingTimingArray[i][1] = ;
            pairs[i] = new Pair(Integer.parseInt(splittedLine[0]), Integer.parseInt(splittedLine[1]));
        }
        
        Arrays.sort(pairs);

        Stack<Pair> intervelPairs = new Stack<>();

        for(int i = 0; i < pairs.length; i++){
            if( i == 0) {
                intervelPairs.push(pairs[i]);
            } else {
                if( pairs[i].st > intervelPairs.peek().et){
                    intervelPairs.push(pairs[i]);
                } else {
                    intervelPairs.peek().et = Math.max(intervelPairs.peek().et, pairs[i].et);
                }
            }
        }

        Stack<Pair> reversedPair = new Stack<>();

        while(!intervelPairs.isEmpty()){
            reversedPair.push(intervelPairs.pop());
        }

        while(!reversedPair.isEmpty()){
            System.out.println(reversedPair.pop());
        }
        
    }

    // create Pair class to sort the array of object
    public static class Pair implements Comparable<Pair> {
        int st;
        int et;

        Pair(int st, int et){
            this.st = st;
            this.et = et;
        }

        @Override
        public int compareTo(Pair other){
            if(this.st != other.st){
                return this.st - other.st;
            } else{
                return this.et - other.st;
            }
        }

        @Override
        public String toString(){
            return this.st + " " + this.et;
        }
    }
}
