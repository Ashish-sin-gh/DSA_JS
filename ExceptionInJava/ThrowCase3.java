package ExceptionInJava;

public class ThrowCase3 extends RuntimeException{
    public static void main(String[] args) {
        throw new ThrowCase3(); 
        // throw only work with Throwable class type and its child 
        // hence this is compile time error
        /*
            to slove this issue 
            make ThrowCase3 class child of Throwable class or its child
                public class ThrowCase3 extends RuntimeException
         */
    }
}
