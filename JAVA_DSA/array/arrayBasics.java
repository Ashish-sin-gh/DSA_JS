package array;

public class arrayBasics {
    public static void main(String[] args) {
        // declare array
        int[] arr;

        // initalize array - space allocation
        arr = new int[5];

        // assigne value
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 40;
        arr[3] = 80;
        arr[4] = 100;

        // access the array
        for(int i = 0; i< arr.length; i++){
            // System.out.println(arr[i]);
        }

        int[] arr2 = arr;
        arr2[1] = 200;

        System.out.println(arr[1]);
        System.out.println(arr2[1]);
    }
}
