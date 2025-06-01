package oops.memberModifer2;

import oops.memberModifer.A1;

public class A2 {

    private static void m3(){
        System.out.println("I was called within a the class where are i was declared");
    }

    public static void main(String[] args) {
        A1 a = new A1();
        a.m1();
        // a.m2();
        m3(); // pvt memeber can be only called from within same class
    }
}
