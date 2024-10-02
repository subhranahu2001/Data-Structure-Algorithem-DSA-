package Recursion;

public class BinarySearch {

    public static boolean search(int[] arr,int target) {
        int left = 0,right = arr.length - 1, mid = 0;

        while(left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
        }

        return false;

    }

    public static boolean biSearch(int[] arr,int target,int start,int end) {

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] > target) {
                return biSearch(arr,target,start,mid - 1);
            }
            if (arr[mid] < target) {
                return biSearch(arr,target,mid + 1,end);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8};
//        System.out.println(search(new int[]{1,2,3,4,5,6,7,8},10));
        System.out.println(biSearch(arr,1,0, arr.length - 1));
    }
}
