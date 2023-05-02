package codetalksdna.Arrays;

import java.util.Arrays;

public class DeclaringSizeAsZeroOrNegative {
    public static void main(String[] args) {
        int[] number = new int[0];
        System.out.println("Array with Size 0::" + " " + Arrays.toString(number));

        int[] numbers = new int[-1];
        System.out.println("Array with Size Negative::" + " " + Arrays.toString(numbers));
    }
}
