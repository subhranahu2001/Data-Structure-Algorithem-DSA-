package Arrays_Prep.Medium;

public class Question_11 {

    /*
    * Container With Most Water
    * */

    public static int maxArea(int[] arr) {
        int area = 0, height, breath;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                breath = j - i;
                height = Math.min(arr[i],arr[j]);
                area = Math.max(area,height* breath);
            }
        }
        return area;
    }

    //Using Two Pointer approach

    public static int findArea(int[] arr) {
        int area = 0;
        int left = 0,right = arr.length - 1;

        while (left < right) {
            area = Math.max(area,(Math.min(arr[left],arr[right]) * (right - left)));
            if (arr[left] > arr[right]) {
                right--;
            } else left++;
        }

        return area;
    }

    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(findArea(arr));
    }
}
