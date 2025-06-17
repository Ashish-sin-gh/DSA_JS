package function;

import java.util.*;

public class npr {
    public static int fact(int num){
        if( num == 0 || num == 1){
            return 1;
        }
        int nm1 = fact(num - 1);
        return num * nm1;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scn.nextInt();
        System.out.print("enter r: ");
        int r = scn.nextInt();

        int npr = fact(n)/ fact(n-r);
        int ncr = fact(n)/(fact(n-r)*fact(r));
        System.out.println(n + " P " + r + " = " + npr);
        System.out.println(n + " C " + r + " = " + ncr);
        scn.close();
    }
}
