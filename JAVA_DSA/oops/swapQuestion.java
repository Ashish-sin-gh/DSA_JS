package oops;

public class swapQuestion{
    public static class Person{
        int age;
        String name;

        void getDetails(){
            System.out.println(name);
            System.out.println(age);
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "ashish";
        p1.age = 20;
        
        Person p2 = new Person();
        p2.name = "himanshu";
        p2.age = 26;

        System.out.println("\nbefore swap: ");
        p1.getDetails();
        p2.getDetails();

        swap(p1, p2);

        System.out.println("\nafter swap: ");
        p1.getDetails();
        p2.getDetails();
    }

    public static void swap(Person prs1, Person prs2){
        prs1 = new Person();

        int age = prs1.age;
        prs1.age = prs2.age;
        prs2.age = age;

        prs2 = new Person();

        String name = prs1.name;
        prs1.name = prs2.name;
        prs2.name = name;
    }
}   