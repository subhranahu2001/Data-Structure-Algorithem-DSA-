package Basic_Questions;

import java.util.Scanner;

public class HCF {

    //Euclidean algorithm
    public static int findGCD(int a,int b) {

        while(a > 0 && b > 0) {
            if (a > b) a %= b;
            else b %= a;
        }
        if (a == 0) {
            return b;
        } else return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD : "+findGCD(a,b));
    }
}
