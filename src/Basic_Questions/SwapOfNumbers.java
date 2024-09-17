package Basic_Questions;

public class SwapOfNumbers {

    //way-1
    public static void swap_1(int a,int b) {
        // Using third variable;
        int x = a;
        a = b;
        b = x;
        System.out.println(" a = "+a+", b = "+b);
    }

    //way -2

    public static void swap_2(int a, int b) {
        // using addition and subtraction
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" a = "+a+", b = "+b);
    }

    //way-3
    public static void swap_3(int a,int b) {
        // using bit manipulation

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(" a = "+a+", b = "+b);

    }

    public static void swap_4(int a , int b) {
        b = a + b - (a = b);
        System.out.println(" a = "+a+", b = "+b);
    }


    public static void main(String[] args) {
        swap_1(10,20);
        swap_2(-10,5);
        swap_3(15,20);
        swap_4(50,20 );
    }
}
