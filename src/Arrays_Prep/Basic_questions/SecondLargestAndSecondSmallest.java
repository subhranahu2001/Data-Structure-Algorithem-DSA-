package Arrays_Prep.Basic_questions;

import java.util.Arrays;

public class SecondLargestAndSecondSmallest {
    public static int[] getSecondOrderElements(int n, int []arr) {

        if (n < 2)
        {
            return new int[] {-1,-1};
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
            if (arr[i] < small)
            {
                second_small = small;
                small = arr[i];
            }
            else if (arr[i] < second_small && arr[i] != small)
            {
                second_small = arr[i];
            }

            if (arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }

        return new int[] {second_large,second_small};

    }

    public static void main(String[] args) {
        int[] arr = Common.common();

        System.out.println(Arrays.toString(getSecondOrderElements(arr.length,arr)));
    }
}
