package oops.methodOverloading;

class Test {
    public void method(StringBuffer sb){
        System.out.println("method of StringBuffer");
    }
    public void method(String str){
        System.out.println("method of string");
    }
}

public class NullCase{
    public static void main(String[] args){
        Test t = new Test();
        t.method(new StringBuffer("ashish"));
        t.method("ashish");

        t.method(null); // compiler error as this method in Test class is ambigious i.e. both string and stringBuffer agree to the null argument
        /*
                        Object
                          |
                 _________|__________
                |                    |
              String           StringBuffer
         */
    }
}