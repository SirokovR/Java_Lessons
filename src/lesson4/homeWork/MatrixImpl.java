package lesson4.homeWork;

public class MatrixImpl {
    private final int[][] matrx;


    public static int[][] finalValue = new int[5][5];


    public MatrixImpl(int n, int m) {
        matrx = new int[n][m];


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


    public void print() {
        System.out.println("Matrix from : " + "row " + matrx.length + "  " + " columns " + matrx[0].length);
        for (int[] ints : matrx) {
            for (int j = 0; j < matrx[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }





    public static void finalPrint() {
        System.out.println("Matrix after multiplying is: from : " + "row " + finalValue.length + "  " + " columns " + finalValue[0].length);
        for (int[] ints : finalValue) {
            for (int j = 0; j < finalValue[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}