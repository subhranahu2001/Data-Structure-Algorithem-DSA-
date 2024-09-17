package Basic_Questions;

import java.util.Scanner;

public class FibonacciSeries {

    public static void printSeries(int limit) {
        int a = 0, b = 1 , c;
        for (int i = 1; i <= limit; i++) {
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no Of test cases");
        int x = sc.nextInt();
        while (x-- != 0) {
            int limit  = sc.nextInt();
            printSeries(limit);
        }


    }
}
