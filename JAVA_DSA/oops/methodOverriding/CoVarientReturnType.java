/*
    until 1.4 verion - return type must be same 
    
    after 1.4 - co varient (child type - eg-> if parent method return type is object child method return type can be String, StringBuffer, Integer, etc) return type is allowed

    co-varient concept only aplicable for Object type (not premitive types)
*/
package oops.methodOverriding;

class P {
    public Object m1(){
        System.out.println("Object data type");
        return null;
    }
}
class C extends P {
    public String m1(){
        System.out.println("String - co-varient data type");
        return null;
    }
}
public class CoVarientReturnType {
    public static void main(String[] args) {
        P p = new C();
        p.m1();
    }
}
