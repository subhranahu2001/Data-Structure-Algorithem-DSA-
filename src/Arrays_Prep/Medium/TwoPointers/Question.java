package Arrays_Prep.Medium.TwoPointers;

import Arrays_Prep.Basic_questions.Common;

import java.util.Arrays;

import static Arrays_Prep.Basic_questions.ReverseAnArray.swap;

public class Question {

    /*
    * sort an array consisting of only 0s and 1s
    * */

    public static void sortArray(int[] arr) {


        int left = 0,right = arr.length - 1;

        while(left < right) {
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
            if (arr[left] != 0 && arr[right] != 1) {
                swap(arr,left,right);
                left++;
                right--;
            }
        }


    }

    public static void main(String[] args) {

        int[] arr = Common.common();
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
