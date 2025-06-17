/*
 * A b = (C) d; -> Syntax for object typecasting
 * 
 * Object typecasting is allowed when below three stepwise condition is accepted by java compiler and JVM
 
 *  step 1 - the type of d should be somehow related to C.
 *  step 2 - C is same as or child of A 
 *  step 3 - the internal runtime object (d) is same as or child of C   
 */

package oops.ObjectTypeCasting;

public class Cases {
    public static void main(String[] args) {
       // example 1
    //    Object obj = new String("sam");
    //    StringBuffer sb = (StringBuffer) obj;
       // this will show class casting exeption error
       /*
            why ?
            check 1 - is type of obj (Object) related to type caster(StringBuffer) ? YES
            check 2 - is stringBuffer same to child of reference type (StringBuffer)?
            check 3 - is runtime object of obj (string) related type caster ? NO
        */

        // example 2
        Object o = new String("john");
        String s = (String) o;
        System.out.println(s);
        //this will run fine
        /*
            why?
            case 1 - is type of o related to typeCaster(String)? YES
            case 2 - is reference type related to TypeCaster? YES
            case 3 - is typeCaster same or child of runtime object of o ? YES

         */
    }
}
