package Recursion;

public class FibonacciNo {

    public static int fib(int k) {
        // Base condition
        if (k < 2 ) {
            return k;
        }
        return fib(k -1) + fib(k -2);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
