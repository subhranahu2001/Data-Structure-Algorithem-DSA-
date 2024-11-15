package Strings;

import java.util.*;

public class GroupOfAnagram {

    public static List<List<String>> groupAnagrams(String[] arr) {

        if (arr.length == 0) {
            return new ArrayList<>();
        }

        Map<String,List<String>> map = new HashMap<>();

        for (String s : arr) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                map.put(key,new ArrayList<>(List.of(s)));
            }

        }

        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter the Strings of anagram :");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        List<List<String>> lists = groupAnagrams(arr);
        System.out.println(lists);
    }
}
