package oops.methodOverloading;
class Test{
    public void m1(){
        System.out.println("method with no argument");
    }

     public void m1(int i){
        System.out.println("method with 1 argument");
    }

     public void m1(int i, int j){
        System.out.println("method with 2 argument");
    }

     public void m1(String s){
        System.out.println("method with 1 string argument");
    }
}
public class methodOverloadInJava {
    public static void main(String[] args) {
        Test t = new Test();

        t.m1();
        t.m1(10);
        t.m1("Ashish");
        t.m1(10,20);
    }
}

// in overloading method resolution is taken care by compiler (not JVM) based on reference type ( not based on run time object )
// hence overloading is also called 
// compile time polymorphism 
// static polymorphism
// early binding