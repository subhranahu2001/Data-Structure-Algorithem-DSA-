package Arrays_Prep.Basic_questions;

import java.util.Scanner;

public class CountNoOfOccurrences {


    public static int countOccurrence(int[] arr, int element) {
        if (arr == null) {
            return 0;
        }

        int count = 0;
        for (int a : arr) {
            if (a == element) {
                count ++;
            }
        }
        return count;

    }

    public static int findLastIndexOfOccurrence (int[] arr, int element) {
        if (arr == null) {
            return -1;
        }
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Common.common();

        System.out.println("Enter the no to find : ");
        int element = sc.nextInt();
        System.out.println(countOccurrence(arr,element));
        System.out.println();
        System.out.println(findLastIndexOfOccurrence(arr,element));
    }
}
