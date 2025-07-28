package oops;

public class ConstructorClass {
    public static void main(String[] args){
        Human h1 = new Human(26, "Harshit");
        System.out.println(h1.age + " " + h1.name);
        Human h2 = new Human();
    }

    public static class Human{
        int age;
        String name;

        Human(int age, String name){
            this.name = name;
            this.age = age;
        }

        Human(int age){
            this.age = age;
        }

        Human(){
            System.out.println(this.name + " " + this.age);
        }
    }
}
