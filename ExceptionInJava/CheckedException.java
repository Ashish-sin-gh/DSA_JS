/*
 * checked exception - it is an exception that is checked by the compiler but dont required to be handled for smooth functioning of the program
 */

package ExceptionInJava;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {
    public static void main(String[] args) {
        PrintWriter pw;
        try{
            pw = new PrintWriter("test.txt");
        } catch(FileNotFoundException e) {
            System.err.println("first make a file in the system");
        } 
        pw.println("hellow world");
    }
}
