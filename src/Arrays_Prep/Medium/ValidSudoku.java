package Arrays_Prep.Medium;

import java.util.HashSet;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        int N = 9;

        // use hashset to record the status

        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] clos = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for (int r = 0; r < N; r++) {
            rows[r] = new HashSet<>();
            clos[r] = new HashSet<>();
            boxes[r] = new HashSet<>();
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                char val = board[r][c];

                //check if the position id filled with number
                if (val == '.') {
                    continue;
                }

                //check the row
                if (rows[r].contains(val)) {
                    return false;
                }
                rows[r].add(val);
                //check the column
                if (clos[c].contains(val)) {
                    return false;
                }
                clos[c].add(val);

                //check the box
                int idx = (r / 3) + 3 + (c / 3);
                if (boxes[idx].contains(val)) {
                    return false;
                }
                boxes[idx].add(val);
            }
        }
        return true;
    }
}
