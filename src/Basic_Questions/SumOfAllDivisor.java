package Basic_Questions;

/*
* Sum of all divisors from 1 to n
*
* Input:
N = 4
Output:
15
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
ans = F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7
    = 15
 */

import java.util.Scanner;

public class SumOfAllDivisor {

    public static long findAllSum(int input) {
        long totalSum = 0;
        while(input > 0) {
            totalSum += individualDivisorsSum(input--);

        }

        return totalSum;
    }

    private static int individualDivisorsSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }




    static class Solution{
        static long sumOfDivisors(int N){
            long totalDiv = 0;
            // Loop over each number from 1 to N
            for(int i = 1; i <= N; i++) {
                // For each number i, it is a divisor of all its multiples
                totalDiv += (long) (N / i) * i;  // Add i for each multiple of i up to N
            }
            return totalDiv;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input : ");
        int input = sc.nextInt();

        long n = findAllSum(input);

        long n1 = Solution.sumOfDivisors(input);
        System.out.println(n1);
    }
}
