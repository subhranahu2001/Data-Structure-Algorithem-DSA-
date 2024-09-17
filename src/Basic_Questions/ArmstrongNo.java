package Basic_Questions;

public class ArmstrongNo {
    /*
    * Armstrong Number
    * n - no of digit
    * Ex - abcd.. = pow(a,n)+ pow(b,n) + pow(c,n) + pow(d,n)
    * e.g - 153 = 1*1*1 + 5*5*5 + 3*3*3
     * */

    public static boolean isArmstrong(int n) {

        int digit = (int)Math.log10(n) + 1;
        int sum = 0;
        int temp = n;
        while (temp > 0) {

            int r = temp % 10;
            sum += (int) Math.pow(r,digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static void printArmstrong(int left, int right) {

        for (int i = left; i <= right; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static int nthArmstrong(int nth) {

        int count = 0;

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            int temp = i, digit =(int) Math.log10(i) + 1 , sum = 0;
            while (temp > 0) {
                int r = temp % 10;
                sum += (int) Math.pow(r,digit);
                temp /= 10;
            }
            if (sum == i) {
                count++;
            }
            if (count == nth) {
                return i;
            }
        }
        return nth;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(548834));
        printArmstrong(1,1000);
        System.out.println();
        System.out.println(nthArmstrong(20));
    }
}
