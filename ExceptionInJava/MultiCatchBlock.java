package ExceptionInJava;

import java.io.IOError;
import java.io.IOException;

public class MultiCatchBlock{
    public static void main(String[] args){
        try{
            System.out.println(10/0);
            String str = null;
            System.out.println(str.length());
        } catch(NullPointerException | ArithmeticException e){
            e.printStackTrace();
        } 
        /*
        catch(IOException | Exception e){
            e.printStackTrace();
        }

        there should be no relation btn exception in same catch block
        */
    }
}