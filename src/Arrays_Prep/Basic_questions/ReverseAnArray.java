package Arrays_Prep.Basic_questions;

import java.util.Arrays;

public class ReverseAnArray {

    public static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr,int n) {

        int i = 0, j = n - 1;
        while(i < j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        int[] arr = Common.common();
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        reverse(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }


}
