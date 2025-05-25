package oops;



public class swapMethod3 {
    
    public  static  class Person{
        int age;
        String name;

        void getDetails(){
            System.out.println(age);
            System.out.println(name);
        }
    }

    public static void swap(Person person1, Person person2){
        int age = person1.age;
        person1.age = person2.age;
        person2.age = age;

        String name = person1.name;
        person1.name = person2.name;
        person2.name = name;
    }


    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();

        p1.age = 20;
        p1.name = "ashish";

        p2.age = 10;
        p2.name = "hunny";

        System.out.println("\nbefore swap: ");
        p1.getDetails();
        p2.getDetails();

        swap(p1, p2);

        System.out.println("\nafter swap: ");
        p1.getDetails();
        p2.getDetails();
    }
}
