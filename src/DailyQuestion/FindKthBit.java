package DailyQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindKthBit {

    public static char findBit(int n , int k) {
//        String s1 = "0";
        String currentS = "", previousS = "0";
        int index = 2;
        while ( index <= n) {
            currentS = findCurrentS(previousS);
            previousS = currentS;
            index++;
        }
        System.out.println(previousS);
        return previousS.charAt(k - 1);

    }

    private static String findCurrentS(String previousS) {
        StringBuilder curr = new StringBuilder();
        curr.append(previousS).append("1");
        String invertWithReverse = inverString(previousS);
        curr.append(invertWithReverse);

        return curr.toString();

    }

    private static String inverString(String previousS) {
        StringBuilder invert = new StringBuilder();
        for (int i = 0; i < previousS.length(); i++) {
            if (previousS.charAt(i)=='1') {
                invert.append("0");
            }else invert.append("1");
        }
        return invert.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findBit(n,k));
    }


}
