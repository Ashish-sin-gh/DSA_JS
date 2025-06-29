/*
 *  formate of the exception:
 * 
 *  name of the exception : Description
 *      at stack trace
 */

package ExceptionInJava;

public class PrintException {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        } catch ( ArithmeticException e){
            System.out.println("\nnext line will print complete information related to the exception");
            e.printStackTrace(); // prints the name, descrpition and stack trace of the exception
            
            
            System.out.println("\nnext line will print name and description related to the exception");
            System.out.println(e.toString()); // this will only print the name and description of the error - not the stack trace
            
            System.out.println("\nnext line will print name and description related to the exception");
            System.out.println(e); // as it is object type, internally toString() is called and it will also print name and description  
            
            
            System.out.println("\nnext line will print description related to the exception");
            System.out.println(e.getMessage()); // printd only the description of the excption
            
        }
    }
}
