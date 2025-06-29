package ExceptionInJava;

public class Try_mulipleCatch {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        } catch (Exception e){
            e.printStackTrace();
        } catch (ArithmeticException e){ // Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
            // compile time error
            System.out.println(10/5); 
        }
    }
}
