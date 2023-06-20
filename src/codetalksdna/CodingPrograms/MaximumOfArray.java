package codetalksdna.CodingPrograms;

import java.util.Arrays;

public class MaximumOfArray {
    public static void main(String[] args) {
        int[] arr = {21, 32, 13, 34, 15, 6};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        System.out.println(Arrays.toString(arr));
    }
}
