/*
 * this is not a over-riding concept as the method signature in child and parent classes is not same.
 * the int... and int is not same when it comes to number of parameters
 * 
 * hence it is over-loading concept as the method name is same and parameter is different 
 */

package oops.methodOverriding;

class P {
    public void m1 (int... i){
        System.out.println("parent method executed");
    }
}
class C extends P {
    public void m1(int i){
        System.out.println("child method executed");
    }
}

public class VarArgWRTmethodOverriding {
    public static void main(String[] args) {
        P p = new P();
        p.m1(10);

        C c = new C();
        c.m1(10);

        P p1 = new C();
        p1.m1(10); // as it is overloading concept and not overriding concept the method resolution is done using compiler based on reference type
    }
}
