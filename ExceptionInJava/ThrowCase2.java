package ExceptionInJava;

public class ThrowCase2 {
    public static void main(String[] args) {
        System.out.println(10/0);
        System.out.println("next line");
        // this will give Runtime error only 

        throw new ArithmeticException("/ by zero");
        System.out.println("last line"); // this is unreachable code coz of the above explicit throw. compiler will check this before hand and give compile time error ulike 10/0

    }
}
