import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);

//        Set<Integer[]> set = new HashSet<>();
//        set.add(new Integer[]{10,20});
//        set.add(new Integer[]{20,10});
//        for (Integer[] i : set) {
//            System.out.println(Arrays.toString(i));
//        }
//        System.out.println(set.size());

        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < 26;i++) {
            sb.append("#");
            sb.append(i);
        }
        System.out.println(sb);

        }
    }
