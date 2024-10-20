package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {

    public static String reverse(String s) {

        String[] strings = s.split(" ");
StringBuilder builder = new StringBuilder();

        for (int i = strings.length - 1; i >= 0; i--) {
            builder.append(strings[i]).append(" ");
        }

        return builder.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(reverse(s));
    }

}
