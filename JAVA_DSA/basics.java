import  java.util.*;

class Basics{
    public static void main(String [] args){
        System.out.println("ashish hello");

        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int i = Integer.parseInt(scn.nextLine());
        System.out.println(s + " is " + i + " years old");

        scn.close();
    }
}