package Arrays_Prep.Basic_questions.ArrayRotaion;

import Arrays_Prep.Basic_questions.Common;

import java.util.Scanner;

public class FrequencyArray {

    public static int[] createFrequencyArray(int[] arr) {
        int[] freq = new int[(int)Math.pow(10,5)];

        for (int j : arr) {
            freq[j]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Query :");
        int query = sc.nextInt();
        int[] freq = createFrequencyArray(arr);

        while (query-- > 0) {
            System.out.println("Enter  a number to check :");
            int no = sc.nextInt();
            if (freq[no] > 0) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
