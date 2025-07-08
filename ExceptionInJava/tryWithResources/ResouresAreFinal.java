package ExceptionInJava.tryWithResources;

public class ResouresAreFinal {
    public static void main(String[] args) throws FileNotFoundException{
        try (FileReader fr = new FileReader("test.txt")){
            /*
             * some code
             */
            fr = new FileReader("text2.txt");    // resign not possible as resources are final // compile time error
        }
    }
}
