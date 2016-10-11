package com.epam.alex;

/**
 * Created by user on 07.10.2016.
 */
public class MatrixMultiplication {



    public    static Matrix multiply(Matrix matrix1, Matrix matrix2) {

        int[][] matrix3 = new int[matrix1.getRow()][matrix2.getCol()];
        for (int i = 0; i < matrix1.getRow(); i++) {
            for (int j = 0; j < matrix2.getCol(); j++) {

                for (int k = 0; k < matrix1.getCol(); k++)
                    matrix3[i][j] += matrix1.getValue(i, k) * matrix2.getValue(k, j);
            }
        }
        return new Matrix(matrix3);
    }

}