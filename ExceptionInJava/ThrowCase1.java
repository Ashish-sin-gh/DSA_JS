package ExceptionInJava;

public class ThrowCase1 {
    public static void main(String[] args) {
        // m1();
        m2();
    }

    static ArithmeticException ae1 = new ArithmeticException(); // refence type is ArithmeticaException and is initialized with ArithmeticException object
    public static void m1(){
        throw ae1; // it will thow an ArithmeticException
    }

    static ArithmeticException ae2; // has no object hence static defult value will be provided which is Null
    public static void m2(){
        throw ae2; // throw Null
        // it will throw an NullPointerException
    }
}
