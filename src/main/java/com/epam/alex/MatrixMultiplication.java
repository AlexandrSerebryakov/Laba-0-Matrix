package com.epam.alex;

/**
 * Created by user on 07.10.2016.
 */
public class MatrixMultiplication {
    private Matrix matrix1;
    private Matrix matrix2;

    public  static Matrix multiply(Matrix matrix1, Matrix matrix2) {
        int row3 = matrix1.getRow();
        int col3 = matrix2.getCol();
        int col1row2 = matrix1.getCol();

        Matrix result = new Matrix(row3, col3);

        for (int i = 0; i < row3; i++) {
            for (int j = 0; j < col3; j++) {
                int data = 0;
                for (int k = 0; k < col1row2; k++)
                    data += matrix1.getData(i, k) * matrix2.getData(k, j);
            }
        }
        return  result;
    }

}