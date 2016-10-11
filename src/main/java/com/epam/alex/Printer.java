package com.epam.alex;

/**
 * Created by user on 12.10.2016.
 */
public class Printer {
    public static void print(Matrix matrix) {
        //int i1;
        //int j1;
        int a = matrix.getRow();
        int b = matrix.getCol();
        //int c = matrix.getValue(int i,int j);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; b++) {
                System.out.println(matrix.getValue(i,j));
            }
        }

        //int a = getRow();
        //}

        //StringBuilder stringBuilder = new StringBuilder(Matrix m, int b);
    }
}

