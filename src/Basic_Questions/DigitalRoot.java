package Basic_Questions;

public class DigitalRoot {
    /*
    * e.g -  if a number is 568 then it's digital root
    *    5 + 6 + 8 = 19
    *    1 + 9 = 10
    *    1 + 0 = 1
    * i.e digital root is 1.
    * */

    public static int calDigitalRoot(int n) {
        if( n < 10) {
            return n;
        }

        int root = 0;
        while(n > 0 || root > 9) {

            if (n == 0) {
                n = root;
                root = 0;
            }
            root = root + n % 10;
            n /= 10;

        }
        return root;
    }

    public static void main(String[] args) {
        System.out.println(calDigitalRoot(56));
    }
}
