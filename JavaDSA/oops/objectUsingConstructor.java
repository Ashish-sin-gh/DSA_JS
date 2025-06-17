// default constructor - if you dont provide a constructor, java automatically provide one at time when object is created.

// perimeterized constructor
package oops;

public class objectUsingConstructor {
    public static class Person{
        String name;
        int age;

        Person(String name, int age){  // constructor - always same name as class
            this.name = name;
            this.age = age;
        }

        void getDetails(){
            System.err.println(name);
            System.err.println(age);
        }
    }

    public static void main(String[] args){
        Person p1 = new Person("ashish", 26);
        p1.getDetails();
    }
}

/*
 *  when an object is created ("new" word)
 * 1. space allocation in heap
 * 2. parsing 
 * 3. constructor fire
 *  3.1. this is called 
 */
