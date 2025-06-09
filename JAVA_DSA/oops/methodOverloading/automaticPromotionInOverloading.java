/*
  byte -> short -> int -> long -> float -> double
  char -> int -> long -> float -> double 
 */


package oops.methodOverloading;

class Test{
    public void m1(int i){
        System.out.println("1 int arg");
    }
    public void m1(float f){
        System.out.println("1 float arg");
    }
    public void m1(String st){
        System.out.println("1 string arg");
    }
}

public class automaticPromotionInOverloading {
    public static void main(String[] args) {
        Test t = new Test();
        t.m1(10);
        t.m1(5.6f);
        t.m1('a'); // complier will check for method signature, if it is not found the datype is promoted to next datatype
        // char -> int -> long -> float ->
        t.m1(10l); // long datatype of argument which is not present int the method table of test hence promote the datatype to float (if not present-> double) 
    }
}
