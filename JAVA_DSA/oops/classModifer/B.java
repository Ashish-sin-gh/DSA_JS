package pack2;

import pack1.A;

public class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("obj " + a + " created");
    }
}

// if A class has class access modifer as "public" then only it will be accessed in this package as it is different package as that of A.class package 

// the "default" modifer will only give access to files that are inside same package as default class.