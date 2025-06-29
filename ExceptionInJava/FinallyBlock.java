// finally holds your clean up code - exception there of not - finally will execute everytime

package ExceptionInJava;

import java.io.FileNotFoundException;

public class FinallyBlock {
    public static void main(String[] args) {
        // case 1 - code with no exception 
        try {
            System.err.println("\nin try block");
        } catch(Exception e) {
            System.out.println("in catch block");
        } finally {
            System.out.println("in finally block");
        }

        // case 2 - code with exception and handled 
        try {
            System.err.println("\nin try block");
            System.out.println(10/0);
        } catch(ArithmeticException e) {
            System.out.println("in catch block");
        } finally {
            System.out.println("in finally block");
        }

        // case 2 - code with exception and not handled 
        try {
            System.err.println("\nin try block");
            System.out.println(10/0);
        } catch(NullPointerException e) {
            System.out.println("in catch block");
        } finally {
            System.out.println("in finally block");
        }
    }
}
