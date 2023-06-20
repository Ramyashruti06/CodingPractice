package codetalksdna.CodingPrograms;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {2, 3}};
        int[][] matrix2 = {{1, 2}, {2, 3}};
        int[][] result = new int[2][2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {

            }
        }
        printArray(result);
    }

    private static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
