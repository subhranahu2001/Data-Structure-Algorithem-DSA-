package Arrays_Prep.TwoDArray;

public class Addition {

    public static int[][] addition(int[][] m1,int[][] m2) {

        int [][] arr = new int[m1.length][];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                arr[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return arr;
    }
    
    public static void print(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] first = Common2D.first();
        int[][] second = Common2D.second();
        
        
    }
}
