package oops;

public class swapObjWOfun {
    public static class Person{
        String name;

        void getDetails(){
            System.err.println("\n"+name);
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "ashish";
        
        Person p2 = new Person();
        p2.name = "hunny";

        p1.getDetails();
        p2.getDetails();
        
        Person temp = p1;
        p1 = p2;
        p2 = temp;
        
        p1.getDetails();
        p2.getDetails();
        // this will sucessfully swap as swapping is being on original reference
    }
}
