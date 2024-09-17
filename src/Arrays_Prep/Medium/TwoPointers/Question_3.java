package Arrays_Prep.Medium.TwoPointers;

import Arrays_Prep.Basic_questions.Common;

import java.util.Arrays;

public class Question_3 {
    /*
    * Given an array sorted in non-decreasing order
    * return an array of the squares of each number
    * sorted in non-decreasing order.
    * */
    public static void squareSort(int[] arr) {

        int left = 0, right = arr.length - 1;
        int i = arr.length - 1;
        int[] square = new int[arr.length];
        while (left <= right) {
            if(Math.abs(arr[left])  > Math.abs(arr[right])) {
                square[i--] = arr[left] * arr[left];
                left++;
            } else  {
                square[i--] = arr[right] * arr[right];
                right--;
            }
        }

        System.out.println(Arrays.toString(square));
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        squareSort(arr);
    }
}
