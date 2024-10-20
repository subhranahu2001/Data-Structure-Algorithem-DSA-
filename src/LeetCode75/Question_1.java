package LeetCode75;

import java.util.Arrays;
import java.util.Scanner;

/*
* Merge Two sorted Array
* */
public class Question_1 {
    public static int[] mergeArray(int[] arr1,int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] merge = new int[m+n];
        for (int i = 0; i < m+n; i++) {
            if (i < m) {
                merge[i] = arr1[i];
            } else {
                merge[i] = arr2[i - 4];
            }
        }
        Arrays.sort(merge);
        return merge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size and element");
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter second array size and element");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] ints = mergeArray(arr, arr1);
        System.out.println(Arrays.toString(ints));
    }
}
