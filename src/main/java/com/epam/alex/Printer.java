package com.epam.alex;

/**
 * Created by user on 12.10.2016.
 */
public class Printer {
    public static void print(Matrix matrix) {

        int a = matrix.getRow();
        int b = matrix.getCol();
        for (int i = 0; i < a; i++,System.out.println()) {
            for (int j = 0; j < b; j++) {
                System.out.println(matrix.getValue(i,j));
            }
        }


    }
    public static void print2(int matrix[][], Matrix matrix1, Matrix matrix2) {
        int c = matrix1.getRow();
        int d = matrix2.getCol();
        for (int i = 0; i < c; i++,System.out.println()) {
            for (int j = 0; j < d; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        }
}

