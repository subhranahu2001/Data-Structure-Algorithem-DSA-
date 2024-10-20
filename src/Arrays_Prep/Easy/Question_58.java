package Arrays_Prep.Easy;

import java.util.Scanner;

public class Question_58 {

    public static int lengthOfLastWord(String s) {
        String[] arr = s.replaceAll("\\s"," ").trim().split(" ");
        return arr[arr.length - 1].length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
}
