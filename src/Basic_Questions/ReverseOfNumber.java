package Basic_Questions;

import java.util.Arrays;
import java.util.Collections;

public class ReverseOfNumber {

    public static void reverseNo_1(int n) {
        //using loop
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(rev);

    }

    public static void reverse_2(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        reverseNo_1(5793559);
//        reverse_2(new Integer[]{20,30,50});
    }
}
