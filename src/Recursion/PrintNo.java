package Recursion;

public class PrintNo {

    public static void print(int n) {

        // base condition
        if(n == 0) {
            System.out.println(n);
            return;
        }


        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
    }

}
