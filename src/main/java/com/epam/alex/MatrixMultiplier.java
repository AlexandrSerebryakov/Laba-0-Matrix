package com.epam.alex;

/**
 * Created by Alexandr Serebryakov on 07.10.2016.
 */
public class MatrixMultiplier {



    public   static int[][] multiply(Matrix matrixA, Matrix matrixB) {

        int result[][] = new int[matrixA.getRow()][matrixB.getCol()];
        for (int i = 0; i < matrixA.getRow(); i++) {
            for (int j = 0; j < matrixB.getCol(); j++) {

                for (int k = 0; k < matrixA.getCol(); k++)
                    result[i][j] += matrixA.getValue(i, k) * matrixB.getValue(k, j);
            }
        }
        return  result;
    }

}