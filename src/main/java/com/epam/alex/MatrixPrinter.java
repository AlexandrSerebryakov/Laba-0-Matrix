package com.epam.alex;

/**
 * Created by Alexandr Serebryakov on 12.10.2016.
 */
public class MatrixPrinter {
    public static void printMatrixAB(Matrix matrix) {

        int a = matrix.getRow();
        int b = matrix.getCol();
        for (int i = 0; i < a; i++,System.out.println()) {
            for (int j = 0; j < b; j++) {
                System.out.println(matrix.getValue(i,j));
            }
        }


    }
    public static void printResult (int matrix[][], Matrix matrixA, Matrix matrixB) {
        int c = matrixA.getRow();
        int d = matrixB.getCol();
        for (int i = 0; i < c; i++,System.out.println()) {
            for (int j = 0; j < d; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        }
}

