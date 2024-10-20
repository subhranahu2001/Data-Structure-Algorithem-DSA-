package Strings;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
*  Longest Substring Without Repeating Characters
* */
public class Question_3 {
    public static int findLength(String s){
        int n = s.length();

        if (n == 0) {
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        int maxLength = 0;
        int l = 0;
        for (int right = 0; right < n; right++) {

            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {
                l = Math.max(map.get(currentChar) + 1,l);
            }

            map.put(currentChar,right);

            maxLength = Math.max(maxLength, right-l + 1);

        }


        return maxLength;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(findLength(s));
    }
}
