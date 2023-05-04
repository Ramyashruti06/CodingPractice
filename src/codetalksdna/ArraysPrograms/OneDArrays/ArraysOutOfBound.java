package codetalksdna.ArraysPrograms.OneDArrays;

import java.util.Arrays;

public class ArraysOutOfBound {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 23;
        System.out.println(Arrays.toString(numbers));
    }
}
