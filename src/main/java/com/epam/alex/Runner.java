package com.epam.alex;

/**
 * Created by user on 07.10.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);

        matrix1.fillRandom(50);
        matrix2.fillRandom(50);

        int matrix3[][] = MatrixMultiplication.multiply(matrix1, matrix2);

        Printer.print(matrix1);
        Printer.print(matrix2);
        Printer.print2(matrix3, matrix1, matrix2);



    }
}
