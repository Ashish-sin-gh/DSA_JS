package oops.methodOverriding.ExceptionsInOverrding;

import java.io.IOException;

class P {
    public void m1 () throws IOException{}
}

class C extends P {
    public void m1 () throws Exception{}
}
public class Ex4 {

}

// compiler error - child class method is throwing a checked exception and the parent class method is throwing an child level checked exception 
