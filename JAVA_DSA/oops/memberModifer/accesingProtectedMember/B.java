package accesingProtectedMemberPack2;
import accesingProtectedMemberPack1.A;

public class B extends A{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.var);
    }
}

// always remeber 
// to access a protected memember from another package 
// 1. use child class from the parent class 
// 2. use reference of child class to store child class object
// A b = new B(); -> dont do this 
// B b = new B(); -> do this
