package Arrays_Prep.Basic_questions;

import java.util.Scanner;

public class Common {
    public static int[] common() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();

        return arr;
    }
}
