package Arrays_Prep.Medium.PrefixSum;

import Arrays_Prep.Basic_questions.Common;

import java.util.Arrays;

public class EqualSumSubArray {

    public static boolean isEqualSumSubArray(int[] arr) {
        int n = arr.length;
        // first we find the prefix sum
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        if (arr[n - 1] % 2 != 0) {
            return false;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + arr[i] == arr[n-1]) {
                return true;
            }
        }
        return false;
    }

    static int calculateSum(int[] arr) {
        int totalSum = 0;
        for (int j : arr) {
            totalSum += j;
        }
        return totalSum;
    }

    static boolean usingSuffixSum(int[] arr) {
        int totalSum = calculateSum(arr);

        int prefixSum = 0;
        for (int j : arr) {
            prefixSum += j;
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
//        System.out.println(isEqualSumSubArray(arr));
        System.out.println(usingSuffixSum(arr));
    }
}
