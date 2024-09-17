package Arrays_Prep.Medium.TwoPointers;

import Arrays_Prep.Basic_questions.Common;

import java.util.Arrays;

import static Arrays_Prep.Basic_questions.ReverseAnArray.swap;

public class Question_2 {
    /*
    * Move the all integers at the beginning of the arrays
    * followed by all the odd integers.
    * */

    public static void sortEvenOdd(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {

            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 != 0) {
                right--;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        sortEvenOdd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
