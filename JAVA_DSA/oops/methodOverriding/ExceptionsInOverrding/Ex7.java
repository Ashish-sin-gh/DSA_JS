package oops.methodOverriding.ExceptionsInOverrding;

import java.io.FileNotFoundException;
import java.io.IOException;

class P {
    public void m1 () throws IOException{}
}
class C extends P {
    public void m1() throws FileNotFoundException{}
}
public class Ex7 {
    
}
