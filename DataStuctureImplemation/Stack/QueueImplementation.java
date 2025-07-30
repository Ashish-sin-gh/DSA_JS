package DataStuctureImplemation.Stack;

public class QueueImplementation {
    public static void main(String[] args){
        CustomQueue queue = new CustomQueue(10);
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.pop();
        queue.pop();
        System.out.println(queue.peek());
    }

    public static class CustomQueue{
        private int[] queueArray;
        private int startpointer;
        private int endPointer;
        private int length;

        CustomQueue(int length){
            this.length = length;
            this.endPointer = -1;
            this.startpointer = 0;
            
            this.queueArray = new int[this.length];
        }

        // is full ?
        public boolean isFull(){
            if(this.length != this.endPointer){
                return false;
            } else {
                return true;
            }
        }

        // is empty ?
        public boolean isEmpty(){
            if(this.endPointer == -1){
                return true;
            } else {
                return false;
            }
        }

        // push element
        public void push(int number){
            this.endPointer ++;
            this.queueArray[this.endPointer] = number;
        }

        public int pop(){
            this.startpointer ++;
            return this.queueArray[this.startpointer];
        }

        public int peek(){
            return this.queueArray[this.startpointer]; 
        }

        public void display(){
            for(int i = this.startpointer; i <= this.endPointer; i++){
                System.out.println(this.queueArray[i]);
            }
        }

    }
}
