/*
 *  Static- 
 *          it is used in java for memory management 
 *          works with variables, methods, blocks, nested classes
 
 *  Static variable- 
 *          A static variable belongs to the class rather than instances (objects).
 *          Only one copy is shared across all objects.
 * 
 *  Static method-
*           belongs to the class and not an object
            you can call it withour creating an object 

 *  Static block -
 *          use to initalize static data
 *          executs once once the class is loaded  
 *  
 *  Static nested class- 
 *          only nested classes can be static. 
 *          A static nested class does not need an object of outer class.
 *          We can create object of Nested class directly using Outer class      
 */

package oops;

class Test {
        static int count = 0; // if you are not using static then it will belong to instance object. that means all new object will have new copy

        public static void m1(){
            count++;
            System.out.println(count);
        }

        static{
            int rollCall = 10;
            System.out.println("test class executed" + rollCall);
        }
}

class OuterTest {
    static class InnerClass {
         public void m1(){
            System.out.println("we are inside InnerClass class");
        }
    }
}

public class StoryOfStatic {
    public static void main(String[] args){
        //  all object will share only one copy
        Test t1 = new Test();
        t1.m1();

        Test t2 = new Test();
        t2.m1();

        Test t3= new Test();
        t3.m1();

        Test.m1(); // as the method is static we can access it directly without creating an object 

        System.out.println(Test.count); // as it is static variable it belongs to class hence we can access it directy without creating an object

        OuterTest.InnerClass obj = new OuterTest.InnerClass(); 
        // error if inner class is not static | you cant access it directly 
        // else you can use it directly 
        }
    }