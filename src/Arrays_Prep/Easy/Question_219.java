package Arrays_Prep.Easy;

import Arrays_Prep.Basic_questions.Common;

import java.util.HashSet;
import java.util.Set;

// Find Duplicate
/*
* Given an integer array nums and an integer k,
* return true if there are two distinct indices i and j in
*  the array such that nums[i] == nums[j] and abs(i - j) <= k.
* */
public class Question_219 {

    // boot force approach
    //time complexity O(n2)
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

//        for (int i = 0; i < nums.length -1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
//                    return true;
//                }
//            }
//        }
//        return false;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))return true;
            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        System.out.println(containsNearbyDuplicate(arr,1));
    }

}
