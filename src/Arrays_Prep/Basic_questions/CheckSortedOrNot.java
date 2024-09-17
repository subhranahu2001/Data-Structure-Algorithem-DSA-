package Arrays_Prep.Basic_questions;

import java.util.Arrays;

public class CheckSortedOrNot {

    public static void main(String[] args) {

        int[] arr = Common.common();
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <  arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
