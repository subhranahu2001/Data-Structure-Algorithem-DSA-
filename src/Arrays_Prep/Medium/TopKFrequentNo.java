package Arrays_Prep.Medium;

import Arrays_Prep.Basic_questions.Common;

import java.util.*;

public class TopKFrequentNo {

    public static int[] topK(int[] arr,int k) {

        if (arr.length < 2) {
            return arr;
        }
        Map<Integer,Integer> map = new TreeMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        int index = 0;
        int[] newArr = new int[k];
        for(int i : map.keySet()) {
            newArr[index++] = i;
            if (index == k) {
                break;
            }
        }

//        System.out.println(map);

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the k : ");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(topK(arr,k)));
    }

}
