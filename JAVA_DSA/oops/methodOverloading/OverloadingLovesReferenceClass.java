package oops.methodOverloading;

class Animal {

} 

class Dog extends Animal {

}

public class OverloadingLovesReferenceClass {

    public void m1(Animal a){
        System.out.println("animal class focused method");
    }
     public void m1(Dog d){
        System.out.println("Dog class focused method");
    }
    public static void main(String[] args) {
        OverloadingLovesReferenceClass obj = new OverloadingLovesReferenceClass();
        Animal a1 = new Animal();
        obj.m1(a1);

        Dog d = new Dog();
        obj.m1(d);

        Animal a2 = new Dog(); 
        obj.m1(a2); // method overloading is always based on reference type not based on run time object  
    }
}
