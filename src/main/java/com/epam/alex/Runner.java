package com.epam.alex;

/**
 * Created by Alexandr Serebryakov on 07.10.2016.
 */

/**
 * This program demonstrates multiplication of two matrices.
 *
 * @author Alexandr Serebryakov
 * @version 1.0 2016-10-07
 */

public class Runner {
    public static void main(String[] args) {

        Matrix matrixA = new Matrix(3, 3);
        Matrix matrixB = new Matrix(3, 3);

        matrixA.fillRandom(50);
        matrixB.fillRandom(50);

        int result[][] = MatrixMultiplier.multiply(matrixA, matrixB);

        MatrixPrinter.printMatrixAB(matrixA);
        MatrixPrinter.printMatrixAB(matrixB);
        MatrixPrinter.printResult(result, matrixA, matrixB);



    }
}
