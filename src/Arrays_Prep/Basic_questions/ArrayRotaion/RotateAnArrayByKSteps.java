package Arrays_Prep.Basic_questions.ArrayRotaion;

import Arrays_Prep.Basic_questions.Common;

import java.util.Arrays;
import java.util.Scanner;


public class RotateAnArrayByKSteps {

    public static void rotate(int[] arr,int steps) {
        int n = arr.length;
        int[] rotateArray = new int[n];
        steps = steps % n;
        int k= 0;
        for (int i = steps; i < n; i++) {
            rotateArray[k++] = arr[i];
        }
        for (int i = 0; i < steps; i++) {
            rotateArray[k++] = arr[i];
        }


        System.out.println(Arrays.toString(rotateArray));

    }

    public static void reverse(int[] arr,int first,int last) {
        while (first < last) {
            swap(arr,first,last);
            first++;
            last--;
        }
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    // This is the clockwise rotation
    // anticlockwise rotation formula -> 0 to n-k-1 and n-k to n-1
    public static void rotateUsingNoExtraSpace(int[] arr,int steps) {
        int n = arr.length;
        steps %= n;
        reverse(arr,0,steps-1);
        reverse(arr,steps,n-1);
        reverse(arr,0,n-1);


        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Steps to rotate :");
        int steps = sc.nextInt();
        rotate(arr,steps);
//        rotateUsingNoExtraSpace(arr,steps);

    }
}
