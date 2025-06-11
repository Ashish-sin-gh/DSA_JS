package oops.methodOverriding.ExceptionsInOverrding;

import java.io.IOException;

class P {
    public void m1 () throws Exception{}
}

class C extends P {
    public void m1 () throws IOException{}
}
public class Ex3 {

}
