package DailyQuestion;

import Arrays_Prep.Basic_questions.Common;

import java.util.*;

public class LongestSquareStack {

    public static int maxSquareStack(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> nos = new LinkedHashSet<>();
        int countStack = 1;
        for (int i = 0; i < arr.length  - 1; i++) {
            int index = binarySearch(arr, i + 1,arr[i] * arr[i]);
            if (index != -1) {
                nos.add(arr[i]);
                nos.add(arr[index]);
                countStack++;
            }

        }
//        System.out.println(nos);
        return countStack > 1 ? nos.size() : -1;
    }

    static int binarySearch(int[] arr,int start , int target) {
        int end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        System.out.println(maxSquareStack(arr));
    }

}
