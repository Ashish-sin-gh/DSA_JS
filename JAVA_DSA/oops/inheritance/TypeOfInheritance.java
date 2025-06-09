package oops.inheritance.TypeOfInheritanceClasses;

class Parent1{
    public void m1(){
        System.out.println("Parent1");
    }
}

class Parent2{
    public void m1(){
        System.out.println("Parent2");
    }
}
// single inheritance 
class SingleInheritance extends Parent1 {
    public void m2(){
        System.out.println("single inheritance");
    }
}

// java classes dont provide multiple inheritance 
/* single child inheriting from muliple parents */
// class mulipleInheritance extends Parent1 Parent2{}       // error

// multi-level inheritance 
class MultiLevel extends SingleInheritance{
    public void m3(){
        System.out.println("multi-level inheritance");
    }
}

// hirarchical inheritance
/* reverse of muliple inheritance
 * multiple child extend from single parent 
  */

public class TypeOfInheritance {
    public static void main(String[] args) {
        SingleInheritance c = new SingleInheritance();
        c.m1();

        MultiLevel m = new MultiLevel();
        m.m1();
    }
}
