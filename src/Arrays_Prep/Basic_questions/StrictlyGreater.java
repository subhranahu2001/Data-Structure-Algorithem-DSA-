package Arrays_Prep.Basic_questions;


import java.util.Scanner;

public class StrictlyGreater {

    public static int findStrictly(int[] arr, int ele) {

        int count = 0;
        for (int a : arr) {
            if (a > ele) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        int[] arr = Common.common();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int ele = sc.nextInt();
        System.out.println(findStrictly(arr,ele));
    }
}
