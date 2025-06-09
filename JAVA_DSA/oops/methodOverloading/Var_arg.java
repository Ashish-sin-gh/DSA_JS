package oops.methodOverloading;

public class Var_arg {
    public void m1(int i){
        System.out.println("general argument method");
    }
    public void m1(int... i){
        System.out.println("variable argument method");
    }

    public static void main(String[] args){
        Var_arg var = new Var_arg();
        var.m1();
        var.m1(10,20,30);
        var.m1(10); // both method will match -> general variable will always win this race 

    }
}
