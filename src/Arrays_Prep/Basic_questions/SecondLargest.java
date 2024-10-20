package Arrays_Prep.Basic_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SecondLargest {
    public static int getSecondLargest(int[] arr) {

        HashSet<Integer> hs=new HashSet<>();
        for(int num:arr){
            hs.add(num);
        }
        ArrayList<Integer> arrlst=new ArrayList<>(hs);
        Collections.sort(arrlst);
        if(arrlst.size()==1){
            return -1;
        }
        return arrlst.get(arrlst.size()-2);

    }

    public static void main(String[] args) {
        int[] arr = Common.common();
        System.out.println(getSecondLargest(arr));
    }
}
