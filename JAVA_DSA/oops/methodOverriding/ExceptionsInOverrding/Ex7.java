package oops.methodOverriding.ExceptionsInOverrding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class P {
    public void m1 () throws IOException{}
}
class C extends P {
    public void m1() throws FileNotFoundException, NullPointerException{}
}

/*
 * as NullPointerException is not a unchecked Exception parent class method can work without it as well
 */
