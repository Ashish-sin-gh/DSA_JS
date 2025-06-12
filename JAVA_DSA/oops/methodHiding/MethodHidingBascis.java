/*
 * concept of method hiding 
 * it looks likes method overriding 
 * but look for static method in parent and child class method with same method signature 
 * 
 * in method hiding - method resolution is done by java compiler based on reference type   
 */

package oops.methodHiding;

class P {
    public static void m1(){
        System.out.println("in P method");
    }
}

class C extends P {
    public static void m1(){
        System.out.println("in C method");
    }
}
public class MethodHidingBascis {
    public static void main(String[] args) {
        P p = new P(); 
        p.m1(); // as it is method hiding - op will be method of reference type

        C c = new C();
        c.m1(); // op will be method of refernce type 

        P p1 = new C(); // op will be method of refernce type
        p1.m1();
    }
}
