/*
 * variable resolution is always done by compiler based on reference type
 * either it is static or non-static method - no matter 
 */

 package oops.VariableShadowing;

 class P {
    public String className = "Parent";
 }

 class C extends P {
    public String className = "Child";
 }

 public class VariableResolution{
    public static void main(String[] args) {
        P p = new P();
        System.out.println(p.className);

        C c = new C();
        System.out.println(c.className);
        
        P p2 = new C();
        System.out.println(p2.className);
    }
 }