package Arrays_Prep.Basic_questions.ArrayManipulation;


import Arrays_Prep.Basic_questions.Common;

public class Question_1 {

    /*
    * Find the unique number in a given Array where all the elements are being
    * repeated twice with one value being unique.(Only positive Number)
    * */

    public static int findUnique(int[] a) {
        int[] arr = a.clone();
        int unique = -1;
        if (arr == null || arr.length == 0) {
            return unique;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                unique = arr[i];
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        System.out.println(findUnique(arr));
    }

}
