package Arrays_Prep.Medium.SlidingWindow;


import Arrays_Prep.Basic_questions.Common;

import java.util.Arrays;

/*
* Maximum point you can obtain from card and you have to pick k cards.
* */
public class Question_1 {
    //BootForce approach
    public static int maxSum(int[] arr, int k) {

        int maxSum = 0;
        for (int i = 0; i < arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {

                sum = sum + arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();

        System.out.println(maxSum(arr,4));
    }

}
