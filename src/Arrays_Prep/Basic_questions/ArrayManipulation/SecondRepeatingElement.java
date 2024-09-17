package Arrays_Prep.Basic_questions.ArrayManipulation;

import Arrays_Prep.Basic_questions.Common;

public class SecondRepeatingElement {

    public static int firstRepeating(int[] arr) {
        int element = -1;
        if (arr == null || arr.length == 0) {
            return element;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    element = arr[j];
                    return element;
                }
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        System.out.println(firstRepeating(arr));
    }
}
