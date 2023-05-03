package codetalksdna.Arrays.TwoDArrays;

import java.util.Arrays;

public class SumOfMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{4, 8}, {3, 7}};
        int[][] matrix2 = {{1, 0}, {5, 2}};
        int rows = 2;
        int column = 2;
        int[][] sumOfMatrix = new int[2][2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                sumOfMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sumOfMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

