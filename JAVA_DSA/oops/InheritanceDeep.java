package oops;

class Parent {
    public void m1(){
        System.out.println("method of Parent class executed");
    }
}

class Child extends Parent {
    public void m2(){
        System.out.println("method of Child class executed");
    }
}

public class InheritanceDeep {
    public static void main(String[]args){
        // reference of parent storing object of parent
        Parent p = new Parent();
        p.m1();
        // p.m2();  // error

        // reference of child storing object of child
        Child c = new Child();
        c.m1();
        c.m2();

        // reference of parent stroing object of child
        Parent p2 = new Parent();
        p2.m1();
        // p2.m2(); // wont get compiled as parent reference dont know about child methods

        // refernce of child storing object of parent
        // Child c2 = new Parent(); // not possible
    }
}
