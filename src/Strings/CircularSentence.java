package Strings;

import java.util.Scanner;

public class CircularSentence {
    public static boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");

//        if(arr.length < 2) {
//            return true;
//        }

        if(arr.length < 2) {
            return arr[0].charAt(0) == arr[0].charAt(arr[0].length() - 1);
        }
        char prevFirst = arr[0].charAt(0),prevLast = arr[0].charAt(arr[0].length() - 1), currFirst,currLast = 0;
        for(int i = 1; i < arr.length; i++) {
            currLast = arr[i].charAt(arr[i].length() - 1);
            currFirst = arr[i].charAt(0);
            if(prevLast != currFirst) {
                return false;
            }
            prevLast = currLast;
        }

        return prevFirst == currLast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isCircularSentence(s));
    }

}
