package codetalksdna.CodingPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
    }
}
