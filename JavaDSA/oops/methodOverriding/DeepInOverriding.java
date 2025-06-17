/*
 * method overriding
 * run time polymorphism 
 * dynamic polymorphism
 * late binding 
 * 
 * in method overriding - method resolution tak place by JVM and is based on run time object
 * 
 * behind the scene - 
 *  step 1 - the java compiler check the reference type class for method resolution - 
 *              if found - method is registered 
 *              if not found - Compile time error 
 * 
 *  step-2 - the JVM check the run time object for same method 
 *              if found - method is over ridden and impelemented 
 *              if if not found - method of reference type is impelemented  
 * 
 *          FINAL CHECK IS ALWAYS IN RUN TIME OBJECT 
 * 
 *  rules of overriding method 
 *      1. method signature must be same 
 *      2. until 1.4 verion - return type must be same 
 *         after 1.4 - co varient (child type - eg-> if parent method return type is object child method return type can be String, StringBuffer, Integer, etc) return type is allowed 
 */

package oops.methodOverriding;

class Parent {
    public void wealth() {
        System.out.println("money");
        System.out.println("land");
        System.out.println("gold");
        System.out.println("investments");
        System.out.println("bonds");
    }

    public void marriageChoice(){
        System.out.println("seema");
        System.out.println("preeti");
        System.out.println("komal");
    }
}

class Child extends Parent {
    public void marriageChoice(){
        System.out.println("jennifer");
        System.out.println("sam");
    }
}

public class DeepInOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.marriageChoice();
        System.out.println();
        
        Child c = new Child();
        c.marriageChoice();
        System.out.println();
        
        Parent p1 = new Child();
        p1.marriageChoice();
        System.out.println();

    }
}
