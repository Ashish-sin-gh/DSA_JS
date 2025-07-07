package oops.methodOverriding;

class Test {
    private int rollNumber;

    public void rollNumberSetter(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public int rollNumberGetter(){
        return this.rollNumber;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Test){
            return this.rollNumber == ((Test) o).rollNumber;
        }
        return false;
    }
}

public class OverridingSuperClass {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.rollNumberSetter(20);
        
        Test t2 = new Test();
        t2.rollNumberSetter(20);

        System.out.println(t1.equals(t2));
    }
}
