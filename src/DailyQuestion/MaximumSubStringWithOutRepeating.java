package DailyQuestion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaximumSubStringWithOutRepeating {


    int maxCount;
    public int maxUniqueSplit(String s) {
        maxCount = 0;
        HashSet<String> set = new HashSet<>();
        backTrack(s,set,0);
        return maxCount;

    }
    private void backTrack(String s, Set<String> set, int index) {
        int n = s.length();
        //base case
        if(index == n) {
            maxCount = Math.max(maxCount,set.size());
            return;
        }

        for(int i = index; i < n ; i++) {

            if(s.length()-1-i+set.size()<maxCount){
                break;
            }

            String sub = s.substring(index,i + 1);
            if(!set.contains(sub)) {
                set.add(sub);
                backTrack(s,set,i + 1);
                set.remove(sub);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        MaximumSubStringWithOutRepeating string = new MaximumSubStringWithOutRepeating();
        System.out.println(string.maxUniqueSplit(s));
    }

}
