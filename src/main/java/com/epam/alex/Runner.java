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

        int result[][] = MatrixMultiplier.multiply(matrixA, matrixB);

        MatrixPrinter.print(matrixA);
        MatrixPrinter.print(matrixB);
        MatrixPrinter.printResult(result, matrixA, matrixB);



    }
}
