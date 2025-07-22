package JavaDSA.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingInterval {
    public static void main(String[] args) throws IOException{
        // line 10 to 23 is code for taking inputs from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("enter the number of meetings: ");
        int noOfMeetings = Integer.parseInt(br.readLine());

        int[][] meetingTimings = new int[noOfMeetings][2];  
        
        for(int i = 0; i < noOfMeetings; i++){
            System.out.println("meeting " + (i+1) + " start and end time: ");
            String line = br.readLine();
            String[] arrSplit = line.split(" ");

            meetingTimings[i][0] = Integer.parseInt(arrSplit[0]); 
            meetingTimings[i][1] = Integer.parseInt(arrSplit[1]); 
        }

        // System.out.println("meeting details: ");
        // for(int i = 0; i < meetingTimings.length; i++){
        //     System.out.print(meetingTimings[i][0] + "    ");
        //     System.out.println(meetingTimings[i][1]);
        // }

        // populated pairs array with Pair type item
        Pair[] pairs = new Pair[noOfMeetings];

        for(int i = 0; i < pairs.length; i++){
            pairs[i] = new Pair(meetingTimings[i][0], meetingTimings[i][1]);
        }

        //sort pairs array
        Arrays.sort(pairs);

        // merge or not merge 
        Stack<Pair> st = new Stack<>();

        for(int i = 0; i < pairs.length; i++){
            if(i == 0){
                st.push(pairs[i]);
            } else{
                Pair top = st.peek();
                if(pairs[i].startTime > top.endTime){
                    st.push(pairs[i]);
                } else {
                    top.endTime = Math.max(pairs[i].endTime, top.endTime);
                }
            }
        }

        Stack<Pair> reverseStack = new Stack<>();

        while(!st.isEmpty()){
            reverseStack.push(st.pop());
        }

        System.out.println();
        while(!reverseStack.isEmpty()){
            Pair top = reverseStack.pop();
            System.out.println(top);
        }
    }

    public static class Pair implements Comparable<Pair> {
        int startTime;
        int endTime;

        Pair(int st, int et){
            this.startTime = st;
            this.endTime = et;
        }

        @Override
        public int compareTo(Pair other){
            if(this.startTime != other.startTime){
                return this.startTime - other.startTime;
            } else {
                return this.endTime - other.endTime;
            }
        }

        @Override
        public String toString(){
            return this.startTime + " " + this.endTime; 
        }
    }
}
