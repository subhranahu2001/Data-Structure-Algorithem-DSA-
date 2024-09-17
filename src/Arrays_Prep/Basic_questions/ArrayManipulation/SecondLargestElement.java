package Arrays_Prep.Basic_questions.ArrayManipulation;

import Arrays_Prep.Basic_questions.Common;

public class SecondLargestElement {

    public static int secondLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int max = Integer.MIN_VALUE;

        //find the max no
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
//        System.out.println(max);
        // assign to the min value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        max = Integer.MIN_VALUE;
        // find second max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        System.out.println(secondLargest(arr));
    }
}
