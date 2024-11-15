package Arrays_Prep.Medium;

import Arrays_Prep.Basic_questions.Common;

import java.util.*;

public class TopKFrequentNo {

    public static int[] topK(int[] arr,int k) {
        if (k == arr.length) {
            return arr;
        }

        Map<Integer,Integer> count= new HashMap<>();
        for(int n : arr) {
            count.put(n,count.getOrDefault(n , 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                Comparator.comparingInt(count::get)
        );
        for(int n : count.keySet()) {
            heap.add(n);
            if(heap.size() > k) {
                heap.poll();
            }
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the k : ");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(topK(arr,k)));
    }

}
