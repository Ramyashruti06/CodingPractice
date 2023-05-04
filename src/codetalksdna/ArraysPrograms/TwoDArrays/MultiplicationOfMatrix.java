package codetalksdna.ArraysPrograms.TwoDArrays;

// Revision Required.
public class MultiplicationOfMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{3, 4}, {2, 1}};
        int[][] matrix2 = {{1, 5}, {3, 7}};
        int row1 = 2;
        int col1 = 2;
        int col2 = 2;
        int[][] multiplicationOfMatrix = new int[2][2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                for (int k = 0; k < col2; k++) {
                    multiplicationOfMatrix[i][j] = multiplicationOfMatrix[i][j] + (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }
        System.out.println("Product Matrix");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(multiplicationOfMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
