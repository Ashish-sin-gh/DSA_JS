package oops;

abstract class Vehical{
    public abstract int getWheelsNumber();
}

class Car extends Vehical{
    public int getWheelsNumber(){
        return 4;
    }
}

class Bike extends Vehical{
    public int getWheelsNumber(){
        return 2;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.getWheelsNumber());

        Bike b1 = new Bike();
        System.out.println(b1.getWheelsNumber());
    }
}
