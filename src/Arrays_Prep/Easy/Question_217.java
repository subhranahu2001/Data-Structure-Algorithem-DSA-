package Arrays_Prep.Easy;

import Arrays_Prep.Basic_questions.Common;

import java.util.HashSet;
import java.util.Set;

/*
* Contains Duplicate
* */
public class Question_217 {

    public static boolean isDuplicate (int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        System.out.println(isDuplicate(arr));
    }
}
