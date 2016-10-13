package com.epam.alex;

/**
 * Created by user on 07.10.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Matrix matrixA = new Matrix(3, 3);
        Matrix matrixB = new Matrix(3, 3);

        matrixA.fillRandom(50);
        matrixB.fillRandom(50);

        int matrix3[][] = MatrixMultiplication.multiply(matrixA, matrixB);

        Printer.print(matrixA);
        Printer.print(matrixB);
        Printer.print2(matrix3, matrixA, matrixB);



    }
}
