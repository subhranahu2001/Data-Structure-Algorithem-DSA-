package DailyQuestion;

import java.util.Scanner;

public class MaxSwap_ {

    public static int maxSwap(int no) {
        char[] numArr = Integer.toString(no).toCharArray();

        int n = numArr.length;
        char maxElement = numArr[n - 1];
        int maxIndex = n - 1;
        int swapIdx1 = - 1;
        int swapIdx2 = -1;

        for (int i = n - 2; i >= 0 ; i--) {

            if (numArr[i] > maxElement) {
                maxElement = numArr[i];
                maxIndex = i;
            } else if (numArr[i] < maxElement) {
                swapIdx1 = i;
                swapIdx2 = maxIndex;
            }

        }
        if (swapIdx1 != -1) {
            char temp = numArr[swapIdx1];
            numArr[swapIdx1] = numArr[swapIdx2];
            numArr[swapIdx2] = temp;
        }

        return Integer.parseInt(new String(numArr));

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no :");
        int n = sc.nextInt();
        maxSwap(n);
    }
}
