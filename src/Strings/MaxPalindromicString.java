package Strings;

import java.util.Scanner;

public class MaxPalindromicString {

    //Expand through center
    public  String longestPalindrome(String s) {
        int start = 0,end = 0;
        for(int i = 0; i < s.length(); i++) {
            int odd = expandFromCenter(s,i,i+1);
            int even = expandFromCenter(s,i,i);

            int len = Math.max(odd,even);
            if(end - start < len) {
                start = i - (len - 1) / 2;
                end = i + (len) / 2;
            }
        }

        return s.substring(start , end + 1);

    }

    private int expandFromCenter(String s,int i, int j) {
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        return j - i - 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new MaxPalindromicString().longestPalindrome(s));
    }

}
