package oops.methodOverriding.ExceptionsInOverrding;

class P {
    public void m1() /* throws Exception */{}
}

class C extends P {
    public void m1() throws Exception{}
}
public class Ex2 {
    
}

// the child method is throwing a checked exception 
// hence the parent method should also throw a checked exception (either same or its parent)  