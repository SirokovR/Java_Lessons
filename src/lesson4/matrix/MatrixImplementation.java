package lesson4.matrix;

public class MatrixImplementation {

    private final int[][] matrx;


    public MatrixImplementation(int row, int col) {
        if (row < 1 || col < 1) {
            throw new IllegalArgumentException("Must be greater than zero");
        }
        matrx = new int[row][col];
    }


    public int[][] fill() {
        for (int row = 0; row < matrx.length; row++) {
            for (int col = 0; col < matrx[row].length; col++) {
                matrx[row][col] = lesson2.classWork.Main.getRandomFromRange(9, 15);

            }
        }
        return matrx;
    }


    public static int[][] multiply(int[][] matrix1,
                                   int[][] matrix2) {

        final int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int row = 0; row < matrix1.length; ++row) {
            for (int col = 0; col < matrix2[0].length; ++col) {
                int sum = 0;
                for (int i = 0; i < matrix2.length; ++i) {
                    sum += matrix1[row][i] * matrix2[i][col];
                    result[row][col] = sum;
                }
            }
        }
        return result;
    }
}
