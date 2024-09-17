package Patterns.Medium;

public class Pattern_11 {

    public static void pattern_11(int n) {

        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 ==0) start = 1;
            else start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }


    }

    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i = 1; i < n*2; i++) {
            int star = i <= n ? i : n * -1;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern_11(5);

//        nStarTriangle(3);
    }
}
