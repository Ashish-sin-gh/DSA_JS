/*
 * finally will always executed 
 * even with return statement 
 * 
 * JVM will first run finally, then return will run 
 * 
 * finally block always has highest priority
 */

package ExceptionInJava;

public class FinallyVsReturnStatement {
    public static void main(String[] args) {
        try{
        System.out.println("in try | before return");
        // return;
        } catch(ArithmeticException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("in finally block");
        }

        // case 2
        System.out.println("\n" + m1()); // op - 3
    }

    // case 2 - all block return some value then which will be considered
    public static int m1(){
        try{
            return 10/0;
        } catch(Exception e){
            return 2;
        } finally {
            return 3;
        }
    }
}
