package Arrays_Prep.TwoDArray;

import java.util.*;

public class Question_2570 {

    /*Merge Two 2D Arrays by Summing Values*/

    public static int[][] margArrays(int[][] nums1, int[][] nums2) {


        Map<Integer,Integer> map = new HashMap<>();
        for(int[] arr : nums1) {
            map.put(arr[0],arr[1]);
        }
        for(int[] arr : nums2) {
            if(map.containsKey(arr[0])) {
                map.put(arr[0],arr[1] + map.get(arr[0]));
            } else {
                map.put(arr[0],arr[1]);
            }
        }

        int[][] ans = new int[map.size()][2];
        int i = 0;
        for(int key : map.keySet()) {
            ans[i++] = new int[]{key,map.get(key)};
        }

        Arrays.sort(ans, Comparator.comparingInt(o -> o[0]));

        return ans;


    }

    public static int[][] optimalSolution(int[][] nums1,int[][] nums2) {
        List<int[]> al = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i][0] == nums2[j][0]) {
                al.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                al.add(nums1[i]);
                i++;
            } else {
                al.add(nums2[j]);
                j++;
            }
        }

        while(i < nums1.length) {
            al.add(nums1[i]);
            i++;
        }
        while(j < nums2.length) {
            al.add(nums2[j]);
            j++;
        }
        int[][] res = new int[al.size()][2];
        int x = 0;
        for(int[] a : al) {
            res[x++] = a;
        }

        return res;
    }
}
