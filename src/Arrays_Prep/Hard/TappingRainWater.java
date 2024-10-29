package Arrays_Prep.Hard;

import Arrays_Prep.Basic_questions.Common;

public class TappingRainWater {

    public  static int findQuantityOfWater(int[] arr) {
        int left = 0 , right = arr.length - 1;
        int total = 0;
        int leftMax = arr[0], rightMax = arr[right];

        while (left < right) {
            if (arr[left] < arr[right]) {
                leftMax = Math.max(leftMax , arr[left]);
                if(leftMax - arr[left] > 0) {
                    total += leftMax - arr[left];
                }
                left++;
            } else {
                rightMax = Math.max(rightMax,arr[right]);
                if(rightMax - arr[right] > 0) {
                    total += rightMax - arr[right];
                }
                right--;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        System.out.println(findQuantityOfWater(arr));
    }

}
