package com.epam.alex;

/**
 * Created by user on 07.10.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(4, 4);
        Matrix matrix2 = new Matrix(4, 4);

        matrix1.fillRandom(50);
        matrix2.fillRandom(50);


        Matrix matrix3 = MatrixMultiplication.multiply(matrix1, matrix2);

        System.out.println(matrix1);
        System.out.println(matrix2);
        System.out.println(matrix3);



    }
}
