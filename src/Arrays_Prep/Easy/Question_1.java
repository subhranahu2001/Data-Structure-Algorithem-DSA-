package Arrays_Prep.Easy;

/*
* Two Sum
* */

import Arrays_Prep.Basic_questions.Common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_1 {

    //In this approach the time complexity is O(n)
    public static int[] isTwoSum(int[] arr,int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff),i};
            } else {
                map.put(arr[i],i);
            }
        }
        return null;
    }

    //When the array is sorted

    public static int[] findTwoSum(int[] numbers,int target) {

        int start = 0, end = numbers.length - 1;

        while(start < end) {
            int sum = numbers[start] + numbers[end];
            if(sum == target) {
                return new int[] {start+1,end+1};
            } else if(sum > target) {
                end--;
            } else {
                start++;
            }
        }

        return null;

    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target :");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(isTwoSum(arr,target)));
    }
}
