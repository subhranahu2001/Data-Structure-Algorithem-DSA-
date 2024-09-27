package Basic_Questions;

import java.util.Scanner;

public class Question_1 {
    /*
    * Given a signed 32-bit integer x, return x with its digits reversed.
    * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
    * then return 0.*/

    public static int reverse(int n) {
        if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
            return 0;
        }
        int temp = n;
        n = Math.abs(n);
        long reverse = 0;
        while( n > 0) {
            if (reverse == 0 && n % 10 == 0) {
                n /= 10;
                continue;
            }
            reverse = reverse * 10 + n % 10;
            if (reverse > Integer.MAX_VALUE) {
                return 0;
            }
            n /= 10;
        }
        if (temp < 0) {
            return (int) -reverse;
        }

        return (int) reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to reverse : ");
        int n = sc.nextInt();
        int reverse = reverse(n);
        System.out.println(reverse);
    }
}
