package Arrays_Prep.Medium;

/*
* Given an array of integers arr of even length n and an integer k.

We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.

Return true If you can find a way to do that or false otherwise.
* */

public class Question_1497 {
    public boolean canArrange(int[] arr, int k) {
        int[] map = new int[k];
        for(int element : arr) {
            int rem = ((element % k) + k ) % k;
            map[rem]++;
        }

        if(map[0] % 2 != 0) {
            return false;
        }
        for(int rem = 1; rem <= k / 2; rem++) {
            int com = k - rem;
            if(map[rem] != map[com]) {
                return false;
            }
        }

        return true;
    }
}
