/*
    throw is used to expicilty throw an exception from a method or block of code that JVM will catch
 */

package ExceptionInJava;

public class ThrowKeyword {
    public static void main(String[] args) {
        // System.out.println(10/0); 

        // as this is an exception and has no handling code, the method in which it is rised(main) is responsible to create exception object for this exception and throw it for JVM to catch
        // this will happen internally 

        // but we can do that explicilty/ manually as well - use throw
        throw new ArithmeticException("/by zero");
    }
}
