package Arrays_Prep.TwoDArray;

import java.util.Scanner;

public class Common2D {
    public static int[][] first() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static int[][] second() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}
