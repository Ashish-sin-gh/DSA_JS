package ExceptionInJava.customizedException;

class ImTheException extends RuntimeException{
    ImTheException(String message){
        super(message);
    }
}

public class Example1 {
    public static void main(String[] args) {
        if(true){
            throw new ImTheException("you created and thew an exception");
        }
    }
}
