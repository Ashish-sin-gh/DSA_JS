package oops.methodOverriding.ExceptionsInOverrding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class P {
    public void m1() throws IOException{}
} 

class C extends P {
    public void m1() throws FileNotFoundException, EOFException{}
}

public class Ex5 {
    
}

// this will run as FileNotFound and EOF Exception are checked exception and IOException is its parent
