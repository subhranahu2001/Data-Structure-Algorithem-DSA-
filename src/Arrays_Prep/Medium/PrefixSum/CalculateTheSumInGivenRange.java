package Arrays_Prep.Medium.PrefixSum;

import Arrays_Prep.Basic_questions.Common;

import java.util.Scanner;

public class CalculateTheSumInGivenRange {


    public static void prefixSum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
    }

    public static void main(String[] args) {
//        int[] arr = Common.common();
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the no of queries :");
//        int q = sc.nextInt();
//        prefixSum(arr);
//        while (q-- != 0) {
//            System.out.println("Enter the range to find sum");
//            int start = sc.nextInt(),end = sc.nextInt();
//            if (start == 1) {
//                System.out.println("sum is : " + arr[end - 1]);
//            }else
//                System.out.println("Sum is : "+(arr[end-1] - arr[start - 2] ));
//
//        }
        System.out.println("enter the size and element :");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            arr[i] = sc.nextInt();
        }
        prefixSum(arr);
        System.out.println("Enter the no of queries :");
        int q = sc.nextInt();
        while(q-- != 0) {
            System.out.println("Enter the range to find sum");
            int start = sc.nextInt(),end = sc.nextInt();
            System.out.println("Sum is : "+(arr[end] - arr[start - 1]));
        }

    }
}
