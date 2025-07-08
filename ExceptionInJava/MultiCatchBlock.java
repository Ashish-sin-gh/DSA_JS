package ExceptionInJava;

public class MultiCatchBlock{
    public static void main(String[] args){
        try{
            System.out.println(10/0);
            String str = null;
            System.out.println(str.length());
        } catch(NullPointerException | ArithmeticException e){
            e.printStackTrace();
        }
    }
}