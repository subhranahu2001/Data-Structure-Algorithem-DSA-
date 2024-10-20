package DailyQuestion;

import Arrays_Prep.Basic_questions.Common;

import java.util.Scanner;

public class MaximumBitwise_ORSubsets {

    public static int countMaxOrSubsets(int[] arr) {

        int targetOr = 0;
        for(int n : arr) {
            targetOr |= n;
        }
        return recursionCount(0,arr,0,targetOr);

    }

    private static int recursionCount(int index, int[] arr, int curOr, int targetOr) {

        if(index == arr.length) {
            return curOr == targetOr ? 1 : 0;
        }
        int countPick = recursionCount(index + 1,arr,curOr | arr[index],targetOr);

        int noPickCount = recursionCount(index + 1,arr ,curOr ,targetOr );

        return countPick + noPickCount;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();

        System.out.println(countMaxOrSubsets(arr));

    }

}
