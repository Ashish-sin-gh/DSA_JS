package ExceptionInJava;

public class NestedtryCatch {
    public static void main(String[] args) {
        try{
            System.out.println("outer try block entry");
            try{
                System.out.println("inner try block entry");
                System.out.println(10/0);
                System.out.println("inner try block normally");
            } catch(ArithmeticException e){
                System.out.println("inner catch block entry");
                System.out.println("inner catch block exit");
            }
            System.out.println(10/0);
            System.out.println("outer try block exit nomrally");
        } catch (ArithmeticException e){
            System.out.println("outer catch block entry");
            System.out.println("outer catch block exit");
        }
        System.out.println("out in main");
    }
}
