package DataStuctureImplemation.Stack;

public class QueueImplementation {
    public static void main(String[] args){
        CustomQueue queue = new CustomQueue(3);
        queue.push(10);
        queue.push(20);
        queue.push(30);
        System.out.println(queue.pop() + " poped");
        System.out.println(queue.pop() + " poped");
        // System.out.println(queue.pop() + " poped");
        queue.push(30);
        System.out.println("peek: " + queue.peek());
    }

    public static class CustomQueue{
        private int[] queueArray;
        private int startPointer;
        private int endPointer;
        private int length;
        private int currentSize;

        CustomQueue(int length){
            this.length = length;
            this.endPointer = -1;
            this.startPointer = -1;
            this.currentSize = 0;
            
            this.queueArray = new int[this.length];
        }

        // is full ?
        public boolean isFull(){
            if(this.currentSize == this.length){
                return true;
            } else {
                return false;
            }
        }

        // is empty ?
        public boolean isEmpty(){
            if(this.currentSize == 0){
                return true;
            } else {
                return false;
            }
        }

        // push element
        public void push(int number){
            if(!this.isFull()){
                this.currentSize ++;
                this.endPointer = (this.endPointer + 1) % this.length;
                this.queueArray[this.endPointer] = number;
            } else {
                System.err.println("cant push any new number as queue is empty");
                return;
            }
        }

        public int pop(){
            if(!this.isEmpty()){
                if(this.currentSize == 1){
                    this.currentSize = 0;
                    this.startPointer = -1;
                    this.endPointer = -1;
                } else {
                    this.currentSize --;
                }
                this.startPointer = (this.startPointer + 1) % this.length;
                return this.queueArray[this.startPointer];
            } else {
                return -1;
            }
        }

        public int peek(){
            if(!isEmpty()){
                return this.queueArray[this.startPointer];
            } else{
                return -1;
            }
        }
    }
}
