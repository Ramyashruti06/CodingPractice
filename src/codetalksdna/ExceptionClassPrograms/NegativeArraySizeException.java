package codetalksdna.ExceptionClassPrograms;

import java.util.Arrays;

public class NegativeArraySizeException {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[-1];
            System.out.println("Array with Size Negative::" + " " + Arrays.toString(numbers));
        } catch (Exception e) {
            System.out.println(e);
        }
        int[] number = new int[0];
        System.out.println("Array with Size 0::" + " " + Arrays.toString(number));
    }
}
