package Arrays_Prep.Basic_questions;

import java.util.Arrays;

public class SmallestAndLargest {

    public static void main(String[] args) {

        int[] arr = Common.common();
        System.out.println(Arrays.toString(smallestAndLargestElement(arr)));
    }

    private static int[] smallestAndLargestElement(int[] arr) {
        int min = 0, max = 0;
        min = arr[0];
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr [i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min,max};
    }
}
