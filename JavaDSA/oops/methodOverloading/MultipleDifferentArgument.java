package oops.methodOverloading;

public class MultipleDifferentArgument {

    public void m1(float f, int i){
        System.out.println("float-int method");
    }
    public void m1(int i, float f){
        System.out.println("int-float method");
    }
    public static void main(String[] args) {
        MultipleDifferentArgument obj = new MultipleDifferentArgument();
        obj.m1(10, 10.5f);
        obj.m1(10.5f, 10);
        obj.m1(10, 10); // CE - The method m1(float, int) is ambiguous for the type MultipleDifferentArgument
    }
}
