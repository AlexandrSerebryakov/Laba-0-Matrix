package com.epam.alex;

/**
 * Created by user on 12.10.2016.
 */
public class Printer {
    public static void print(Matrix matrix) {
        int a = matrix.getRow();
        int b = matrix.getCol();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; b++) {
                System.out.println(matrix.getValue(i, j));
            }
        }
        //int a = getRow();
        //}

        //StringBuilder stringBuilder = new StringBuilder(Matrix m, int b);
    }
}

