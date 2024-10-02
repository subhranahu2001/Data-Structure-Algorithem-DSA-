package Arrays_Prep.Easy;

import Arrays_Prep.Basic_questions.Common;

/*
* 121. Best Time to Buy and Sell Stock
* */
public class Question_121 {
    public static int profit(int[] arr) {
        int min = arr[0],profit = 0;

        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            profit = Math.max(profit, j - min);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        System.out.println(profit(arr));
    }
}
