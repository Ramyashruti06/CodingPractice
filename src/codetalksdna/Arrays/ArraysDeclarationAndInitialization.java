package codetalksdna.Arrays;

import java.util.Arrays;

public class ArraysDeclarationAndInitialization {
    public static void main(String[] args) {
        //16Bytes of Memory in heap space.
        int number = 20;
        int[] numbers = new int[2];
        numbers[0] = 20;
        numbers[1] = 30;
        System.out.println(Arrays.toString(numbers));

        String[] name = new String[2];
        name[0] = "Nitesh";
        name[1] = "CodeTalksDNA";
        System.out.println(Arrays.toString(name));
    }
}
