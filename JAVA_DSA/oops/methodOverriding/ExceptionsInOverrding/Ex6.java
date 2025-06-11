package oops.methodOverriding.ExceptionsInOverrding;

import java.io.EOFException;
import java.io.IOException;

class P {
    public void m1() throws IOException{}
} 

class C extends P {
    public void m1() throws EOFException, InterruptedException{}
} 

public class Ex6 {
}

// interruptedException is thrown from the child class method 
// hence parent class method should throw same or parent exception(Exception)
