package Arrays_Prep.Easy;

import Arrays_Prep.Basic_questions.Common;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majority(int[] arr) {

        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for(Integer i : map.keySet()) {
            if (map.get(i) > n / 2) {
                return i;
            }
        }

        return 0;

    }

    public static int moorsVotingAlgo(int[] arr) {
        int count = 0;
        int candidate = arr[0];

        for(int i : arr) {
            if (i == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = i;
                    count++;
                }
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();

        System.out.println(majority(arr));
    }
}
