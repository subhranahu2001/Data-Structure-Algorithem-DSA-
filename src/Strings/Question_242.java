package Strings;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* Valid Anagram
* */
public class Question_242 {

    // 1st approach
    public static boolean validAnagram(String s,String t) {
        int sl = s.length();
        int tl = t.length();
        Map<Character,Integer> map = new HashMap<>();
        if (sl != tl) {
            return false;
        }
        for (int i = 0; i < sl; i++) {
            Character sc = s.charAt(i);
            Character tc = t.charAt(i);
            map.put(sc,map.getOrDefault(sc,0) + 1);
            map.put(tc,map.getOrDefault(tc,0) - 1);
        }

        for(int i : map.values()) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();

        if (sl != tl) {
            return false;
        }
        int[] arr = new int[26];
        for(int i = 0; i< s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i< t.length(); i++) {
            int i1 = arr[t.charAt(i) - 'a']--;
            if( arr[t.charAt(i) - 'a']< 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two String to check : ");
        String s = sc.next();
        String t = sc.next();

//        System.out.println(validAnagram(s,t));

        System.out.println(isAnagram(s,t));

    }
}
