package Basic_Questions;

public class LCM {
    /*
     * LCM - least common multiple
     *
     * */

    public static int findLCM(int firstNo, int secondNo) {
        int max = Math.max(firstNo, secondNo);
        while (true) {
            if (max % firstNo == 0 && max % secondNo == 0) {
                return max;
            }
            max++;
        }
    }

    public static void main(String[] args) {
        System.out.println(findLCM(15,25));
    }

}
