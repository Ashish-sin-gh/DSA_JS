package DataStuctureImplemation.Stack;

public class CustomStackUsingArray {
    public static void main(String[] args){
        CustomStack stack1 = new CustomStack(3);
        stack1.push(15);
        stack1.push(16);
        stack1.push(30);
        // stack1.push(30);
        stack1.pop();

        // stack1.display();
        System.out.println(stack1.peek());
    }

    public static class CustomStack{
        private int[] stackArray;
        private int top;
        private int length;

        //constructor
        CustomStack(int length){
            this.stackArray = new int[length];
            this.length = length;
            this.top = -1;
        }   

        // check if the stack is empty
        boolean isEmpty(){
            if(this.top == -1){
                return true;
            } else {
                return false;
            }
        }

        //push an element
        public void push(int number){
            if(this.top + 1 != this.stackArray.length){
                this.top ++;
                this.stackArray[this.top] = number;
            } else {
                System.out.println("Stack overflow: cannot push " + number);
                return;
            }
        }

        public void pop(){
            if(!isEmpty()){
                this.top --;
            } else {
                System.out.println("Stack is empty");
                return;
            }
        }

        // print peek = top element
        public int peek(){
            if(!isEmpty()){
                return this.stackArray[this.top];
            } else {
                return -1;
            }
        }
        
        // print the stack
        public void display(){
            if(this.isEmpty()){
                System.out.println("Stack is empty");
                return;
            } else {
                for(int i = 0; i <= this.top; i++){
                    System.out.println(this.stackArray[i]);
                }
            }
        }        

    }
}
