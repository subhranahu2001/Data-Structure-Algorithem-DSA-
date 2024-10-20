package Arrays_Prep.Medium;

/*
* Maximum product SubArray
* */
public class Question_152 {

    public static int maxProduct(int[] arr) {

        if(arr.length == 0) {
            return 0;
        }
        int min = arr[0];
        int max = arr[0];
        int result = max;

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int temp = Math.max(current, Math.max(current * min,current * max));
            min = Math.min(current, Math.min(current * min, current * max));
            max = temp;

            result = Math.max(result,max);
        }

        return result;
    }

    public  static int max(int[] arr) {
        int n = arr.length;
        int l = 1,r = 1,max = arr[0];

        for (int i = 0; i < n; i++) {

            l = l==0 ? 1 : l;
            r = r ==0 ? 1 : r;

            l *= arr[i];
            r *= arr[n - i - 1];
            max = Math.max(max,Math.max(l,r));

        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(max(new int[]{3,-1,4}));
    }
}
