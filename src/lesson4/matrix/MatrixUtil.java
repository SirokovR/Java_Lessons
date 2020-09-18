package lesson4.matrix;


public class MatrixUtil {


    public static void print(int [][] array) {
        System.out.println("Matrix consist from : " + "row " + array.length + "  " + " columns " +array[0].length);
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }



}
