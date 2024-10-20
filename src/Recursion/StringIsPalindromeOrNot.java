package Recursion;

import java.util.Scanner;

public class StringIsPalindromeOrNot {

    public static boolean isPalindrome(String s) {
        StringBuilder check = new StringBuilder();
        for (int i = s.length() - 1; i >=0; i--) {
            check.append(s.charAt(i));
        }

        return check.toString().equals(s);
    }

    //Using recursion
    public static boolean isPal(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int left = 0,right = s.length() - 1;

        while(left < right) {

            if (s.charAt(left) != s.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(isPalindrome(s));
    }
}
