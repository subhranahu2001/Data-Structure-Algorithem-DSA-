package Patterns.Basic;

import java.util.Scanner;

public class Pattern {
    public static void pattern_1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern_3(int n) {

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //this is for no of test cases
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int test = sc.nextInt();
//            pattern_1(test);
            pattern_2(test);
            System.out.println();
        }

    }
}
