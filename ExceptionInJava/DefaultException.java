/*
 * runtime Stack 
 * 
 * it is created for each and very threat of a program
 * in normal code there is only one thread and that is MAIN hence MAIN STACK is created
 * every method called in the main stack will create an entity in the main stack called as stack frame
 * it is just like java script execution context
 * 
 * default Exception handling is done by JVM 
 * 
 * its an exception hence it will compile - but error will be thrown at runtime
 */

package ExceptionInJava;

public class DefaultException {
    public static void main(String[] args){
        inner();
    }

    public static void inner(){
        innerInner();
        System.out.println("hii form inner");
        System.out.println(10/0);
        System.out.println("2nd hii form inner");

    }

    public static void innerInner(){
        System.out.println("hello from inner inner");
        // System.out.println(10/0);    
    }
}
