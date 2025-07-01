package ExceptionInJava.checkedExceptionHandle;

public class HandlingExceptionByCaller {
    public static void main(String[] args) {
        doStuff();
    }
    
    public static void doStuff(){ 
        try {
            doMoreStuff(); // either use try catch here or use throws to delegate the handling to caller
        } catch (Exception e) {
            System.out.println("MAIN: I was interrupted");
        }
    }

    public static void doMoreStuff() throws InterruptedException { // caller (doStuff()) will handle the exception
        Thread.sleep(5000); // either use try catch here or use throws to delegate the handling to caller
    }
}
