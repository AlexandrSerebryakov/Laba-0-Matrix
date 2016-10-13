package com.epam.alex;

/**
 * Created by user on 07.10.2016.
 */
public class MatrixMultiplication {



    public   static int[][] multiply(Matrix matrixA, Matrix matrixB) {

        int matrix3[][] = new int[matrixA.getRow()][matrixB.getCol()];
        for (int i = 0; i < matrixA.getRow(); i++) {
            for (int j = 0; j < matrixB.getCol(); j++) {

                for (int k = 0; k < matrixA.getCol(); k++)
                    matrix3[i][j] += matrixA.getValue(i, k) * matrixB.getValue(k, j);
            }
        }
        return  matrix3;
    }

}