package com.epam.alex;

/**
 * Created by user on 07.10.2016.
 */
public class Runner {
    public static void main(String[] args) {

        MatrixFill matrix1 = new MatrixFill(4, 4); //
        MatrixFill matrix2 = new MatrixFill(4, 4); //

        matrix1.fillRandom(5, 10);
        matrix2.fillRandom(5, 10);


        CounterMatrix.multiplyMatrix(matrix1, matrix2);

        System.out.println(matrix1);
        System.out.println(matrix2);



    }
}
