package Strings;

import java.util.Scanner;

public class StringMatchingGoal {

    public static boolean findGoal(String s,String goal) {

        if(s.length() != goal.length()) {
            return false;
        }

        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and goal string :");
        String s = sc.next();
        String goal = sc.next();

        System.out.println(findGoal(s,goal));
    }
}
