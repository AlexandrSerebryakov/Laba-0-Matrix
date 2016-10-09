package com.epam.alex;

/**
 * Created by user on 07.10.2016.
 */
public class MatrixMultiplication {
    private Matrix matrix1;
    private Matrix matrix2;

    public  static int[][] multiply(Matrix matrix1, Matrix matrix2) {
        //int row3 = matrix1.getRow();
        //int col3 = matrix2.getCol();
        //int col1row2 = matrix1.getCol();

        //Matrix result = new Matrix(row3, col3);
        int matrix3[][] = new int[matrix1.getRow()][matrix2.getCol()];
        for (int i = 0; i < matrix1.getRow(); i++) {
            for (int j = 0; j < matrix2.getCol(); j++) {
                //int data = 0;
                for (int k = 0; k < matrix1.getCol(); k++)
                    matrix3[i][j] += matrix1.getMatrix(i, k) * matrix2.getMatrix(k, j);
            }
        }
        return    matrix3;
    }

}