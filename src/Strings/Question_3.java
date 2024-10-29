package Strings;


import java.util.*;

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

    public static int find(String s) {
        int maxLen = 0;
        Set<Character> window = new HashSet<>();

        int left = 0, right = 0;
        while(right < s.length()) {
            while(window.contains(s.charAt(right)))
                window.remove(s.charAt(left++));
            window.add(s.charAt(right++));
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(findLength(s));
        System.out.println(find(s));
    }
}
