package Basic_Questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DecimalToBinary {


    public static void toBinary(int decimal) {
        int size = 0;
        int no, i = 1;
        do {
            no = (int)Math.pow(2,i);
            i++;
            size ++;
        } while (no <= decimal);


        int[] binary = new int[size];
        int index = 0;
        while(decimal > 0) {
            binary[index++] = decimal % 2;
            decimal /= 2;
        }
        List<Integer> list = new ArrayList<>(Arrays.stream(binary).boxed().toList());
        Collections.reverse(list);
        System.out.println(list);

    }

    public static String toBinary_1(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static void main(String[] args) {

        System.out.println(toBinary_1(16));
        toBinary(16);

    }
}
