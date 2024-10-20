package Arrays_Prep.Medium;

import Arrays_Prep.Basic_questions.Common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> find3Sum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> results = new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length && arr[i] <= 0; i++) {
            
            if (i == 0 || arr[i] != arr[i - 1]) {
                twoSum2(arr,i,results);
            }
        }
        
        return results;
    }

    private static void twoSum2(int[] arr, int i, List<List<Integer>> results) {
        int left = i + 1, right = arr.length - 1;

        while (left < right) {
            int sum = arr[i] + arr[left] + arr[right];
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                results.add(Arrays.asList(arr[i],arr[left],arr[right]));
                while ( left < right && arr[left]  == arr[left - 1]) {
                    ++left;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = Common.common();
        List<List<Integer>> lists = find3Sum(arr);
        System.out.println(lists);
    }
}
