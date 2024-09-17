package Patterns.Medium;

public class Pattern_9 {


    public static void pattern_9(int n) {
        //for outer loop
        for (int i = 1; i <= n*2; i++) {
            //calculate total space
            int totalSpace = i < n ? n - i+1 : i - n;
            //calculating for star print
            int totalStar = i <= n ? i * 2 : (n*4)-((i*2)-2);

            for (int space = 1; space < totalSpace; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star < totalStar; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        pattern_9(3);
    }
}
