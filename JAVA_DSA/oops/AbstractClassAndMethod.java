package oops;

abstract class Test{
    public abstract void m1();
    public abstract void m2();
}

class SubTest extends Test{
    public  void m1(){
        System.out.println("m1");
    }
    public  void m2(){
        System.out.println("m2");
    }
} 

// error : 

// class SubTest2 extends Test{
//     public void m2(){
//         System.out.println("m1");
//     }
// }   

class AbstractClassAndMethod{
public static void main(String[] args) {
    System.out.println("in main");
    SubTest t1 = new SubTest();
}
}
