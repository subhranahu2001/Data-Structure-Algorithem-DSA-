package Basic_Questions;

public class PalindromeNo {

    /*
    * abc = cba
    * 121 = 121
    * */

    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;

        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        return n == rev;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(120));
    }

}
