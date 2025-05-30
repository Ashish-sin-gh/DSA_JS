package oops.memberModifer;

public class A1 {
    // public member -> can be accessed from anywhere provided its class is public
    public void m1(){
        System.out.println("in public method");
    }    

    // default member -> can be accessed only within the package 
        void m2(){
            System.out.println("\nthis is a default method");
            System.out.println("this op ensures that method is default memeber and is being called from same package");
        }          
}
