package Arrays_Prep;

import java.util.Arrays;

public class Array_Clone {

    /*
    * Clone Methods
    * clone();
    * Arrays.copyOfRange(arr,from.to);
    *
    * */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        int[] clone = arr.clone();
        clone[4] = 20;
        System.out.println(Arrays.toString(arr));

        int[] a = Arrays.copyOf(arr,3);
        int[] b = Arrays.copyOfRange(arr,1,3);

        System.out.println(Arrays.toString(a));


    }

}
