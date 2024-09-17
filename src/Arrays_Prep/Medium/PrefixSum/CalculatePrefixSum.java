package Arrays_Prep.Medium.PrefixSum;

import Arrays_Prep.Basic_questions.Common;

import java.util.Arrays;

public class CalculatePrefixSum {

    public static int[] createPrefixSumArray(int[] arr) {

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        return prefix;

    }

    public static void inPlacePrefix(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
    }

    public static void main(String[] args) {

        int[] arr = Common.common();
//        int[] prefix = createPrefixSumArray(arr);
        inPlacePrefix(arr);
        System.out.println(Arrays.toString(arr));
    }
}
