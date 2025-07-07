package ExceptionInJava.tryWithResources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(new File("ExceptionInJava/tryWithResources/text.txt"))){
            while(scn.hasNextLine()){
                String str = scn.nextLine();
                System.out.println(str);
            }
        } catch (FileNotFoundException e){
            System.out.println("file again missing bro");
        }
    }
}
