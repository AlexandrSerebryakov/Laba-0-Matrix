package com.epam.alex;

/**
 * Created by user on 07.10.2016.
 */
public class Runner {
    public static void main(String[] args) {



       MatrixData matrix1 = new MatrixData(2, 2);
        MatrixData matrix2 = new MatrixData(2, 2);

        matrix1.fillRandom(10);
        matrix2.fillRandom(10);


        //CounterMatrix.multiplyMatrix(matrix1, matrix2);

        //System.out.println(matrix1.fillRandom(10));
        //System.out.println(matrix2);



    }
}
