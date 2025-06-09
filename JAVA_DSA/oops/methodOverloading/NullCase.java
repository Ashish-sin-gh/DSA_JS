package oops.methodOverloading;

class Test {
    public void method(Object obj){
        System.out.println("method of object");
    }
    public void method(String str){
        System.out.println("method of string");
    }
}

public class NullCase{
    public static void main(String[] args){
        Test t = new Test();
        t.method(new Object());
        t.method("ashish");

        t.method(null); // first preference is child class then Parent class
        //  String class -> Object class
    }
}