package oops;

public class basicClass {
    public static class Person{
        String name;
        int age;

        void printDetails(){
            System.out.println(name);
            System.out.println(age);
        }
    }

    public static void swap(Person p1, Person p2){
        Person temp = p1;
        p1 = p2;
        p2 = temp;
    }
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "ashish";
        p1.age = 26;
        // p1.printDetails();
        
        Person p2 = new Person();
        p2.name = "hershita";
        p2.age = 27;
        // p2.printDetails();

        // non premitive's shallow copy behaviour
        p1.printDetails();
        p2.printDetails();
        
        swap(p1,p2);
        
        p1.printDetails();
        p2.printDetails();
    }
}
