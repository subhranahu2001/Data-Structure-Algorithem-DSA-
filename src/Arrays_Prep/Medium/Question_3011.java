package Arrays_Prep.Medium;

/*You are given a 0-indexed array of positive integers nums.

In one operation, you can swap any two adjacent elements if they have the same number of
set bits
. You are allowed to do this operation any number of times (including zero).

Return true if you can sort the array, else return false.*/
public class Question_3011 {

public static boolean canSortArray(int[] arr) {
    int n = arr.length;

    for (int i = 1; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
            if (arr[j] <= arr[j + 1]) {
                continue;
            } else {
                if (countSetBit(arr[j]) == countSetBit(arr[j + 1])) {
                    swap(arr, j,j+1);
                } else {
                    return false;
                }
            }
        }
    }
    return true;
}

private static void swap(int[] arr,int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}


    public static int countSetBit(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBit(7));
    }

}
