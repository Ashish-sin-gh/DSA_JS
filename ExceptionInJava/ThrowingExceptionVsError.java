package ExceptionInJava;

public class ThrowingExceptionVsError {
    public static void main(String[] args){
        // throw new Exception(); 
        // checked Exception
        // compile time error - unreported exception Exception; must be caught or declared to be thrown

        throw new Error();
        // unchecked Exception
        // runtime error -  Exception in thread "main" java.lang.Error
        //                          at ExceptionInJava.ThrowingExceptionVsError.main(ThrowingExceptionVsError.java:8)
    }
}
