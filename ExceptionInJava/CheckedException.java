/*
 * checked exception - it is an exception that is checked by the compiler but dont required to be handled for smooth functioning of the program
 */

package ExceptionInJava;

import java.io.PrintWriter;

public class CheckedException {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter("test.txt");
        pw.println("hellow world");
    }
}
