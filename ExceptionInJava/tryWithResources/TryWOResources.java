package ExceptionInJava.tryWithResources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWOResources {
    public static void main(String[] args) {
        Scanner scn = null;
        try{
            scn = new Scanner(new File("ExceptionInJava/tryWithResources/text.txt"));
            while(scn.hasNextLine()){
                String str = scn.nextLine();
                System.out.println(str);
            }
        } catch(FileNotFoundException e) {
            System.out.println("file kidhar hai? \n" + e.getMessage());
        } finally {
            if(scn != null){
                scn.close();
            }
        }
    }
}
