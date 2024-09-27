package Strings;


/*
* Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_290 {
    public static boolean matchPattern(String pattern,String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Character,String> match = new HashMap<>();
        for (int i = 0; i < words.length; i++) {

            if (match.containsKey(pattern.charAt(i))) {
                if (!match.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else if (match.containsValue(words[i])) {
                return false;
            } else match.put(pattern.charAt(i),words[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern and String :");
        String pattern = sc.nextLine();
        String s = sc.nextLine();
        System.out.println(matchPattern(pattern,s));
    }
}
