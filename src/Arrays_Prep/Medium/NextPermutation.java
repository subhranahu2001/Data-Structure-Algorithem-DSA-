package Arrays_Prep.Medium;

import Arrays_Prep.Basic_questions.Common;

import java.util.Arrays;

public class NextPermutation {

    public static void permutation(int[] arr) {
        int n = arr.length;
        int right = arr.length - 1;
        while (right > 0) {
            if (arr[right - 1] < arr[right]) {
                int temp = arr[right - 1];
                int index = find(arr,temp,right);
                swap(arr,right - 1,index);
                reverse(arr,right);
                return;
            } else right--;

        }
        reverse(arr,0);
    }

    public static void reverse(int[] arr,int n) {

        int i = n, j = arr.length - 1;
        while(i < j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }


    private static int find(int[] arr, int temp, int from) {
        for (int i = arr.length - 1; i >=from ; i--) {
            if (arr[i] > temp) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        permutation(arr);
        System.out.println(Arrays.toString(arr));
    }

}
