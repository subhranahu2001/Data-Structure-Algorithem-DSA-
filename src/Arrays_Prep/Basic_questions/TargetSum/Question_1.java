package Arrays_Prep.Basic_questions.TargetSum;

            /*
            * find the total numbers of pairs in the Array
            * whose sum is equal to the given value x.
            * */

import Arrays_Prep.Basic_questions.Common;

import java.util.Scanner;

public class Question_1 {


    public static int findPair(int[] arr, int value) {
        int pair = 0;

        if (arr == null) {
            return pair;
        }
//Time complexity O(n2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    pair++;
                    System.out.println(arr[i] +" "+arr[j]);
                }
            }
        }

        return pair;
    }

    /*
    * Count no of triplets whose sum is equal to the given value x.
    * */

    public static int countTriplets(int[] arr,int targetSum) {
        int triplet = 0;
        if (arr == null || arr.length == 0) {
            return triplet;
        }

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        triplet++;
                        System.out.println(arr[i] +"..."+ arr[j] +"..."+ arr[k]);
                    }
                }
            }
        }

        return triplet;
    }


    public static void main(String[] args) {
        int[] arr = Common.common();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target Sum :");
        int sum = sc.nextInt();
//        System.out.println(findPair(arr,sum));
        System.out.println(countTriplets(arr,sum));
    }

}
