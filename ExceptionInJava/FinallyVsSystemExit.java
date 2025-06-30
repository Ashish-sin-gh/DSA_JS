
/*
    System.exit(0) is for haulting JVM without any further processing of the code.
    no code will be executed after System.exit(0);
    status code - 0 - normal termination
                - non zero - abnormal terminaiton

    finally vs System.exit(0) -
            System.exit wins always
*/

package ExceptionInJava;

public class FinallyVsSystemExit {
    public static void main(String[] args) {
        try{
            System.out.println("in try block|before System.exit called");
            System.out.println(10/0);
            System.exit(0);
        } catch(Exception  e){
            System.out.println("in catch block");
        } finally{
            System.out.println("in finally");
        }
    }
}
