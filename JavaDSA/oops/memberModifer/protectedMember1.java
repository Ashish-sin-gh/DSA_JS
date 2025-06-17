package pack1;

class A {
    protected void m1() {
        System.out.println("method m1");
    }
}

class B extends A {
    public static void main(String[] args) {
        A a = new A();
        a.m1();

        B b = new B();
        b.m1();

        A c = new B();
        c.m1();
    }
}

