package lesson4.matrix;

import static lesson4.matrix.MatrixUtil.print;
import static lesson4.matrix.MatrixImplementation.multiply;

public class Main {
    public static void main(String[] args) {
        MatrixImplementation matrix1 = new MatrixImplementation(5, 5);
        MatrixImplementation matrix2 = new MatrixImplementation(5, 5);

        int[][] temp1 = matrix1.fill();
        System.out.println();
        int[][] temp2 = matrix2.fill();
        print(temp1); //testing for output
        print(temp2);   //testing for output
        System.out.println();
        int[][] finalSolution = multiply(temp1,temp2);
        print(finalSolution);




    }
}
