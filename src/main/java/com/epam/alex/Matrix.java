package com.epam.alex;

import java.util.Random;

/**
 * Created by Alexandr Serebryakov on 07.10.2016.
 */

/**
 * Create matrix
 */

public class Matrix {

    private int data[][];

    /**
     * Construct new array.
     *
     * @param row row of array
     * @param col columns of array
     */

    public Matrix(int row, int col) {

        this.data = new int[row][col];

    }



    public void fillRandom(int bound){
         for (int i = 0; i < getRow(); i++){
           for (int j = 0; j < getCol(); j++){

              data[i][j]=new Random().nextInt(bound);
           }
        }
    }

    public int getRow() {
        return data.length;
    }

    public int getCol() {
        return data[0].length;
    }

    public int getValue (int i, int j){
        return data[i][j];
    }

}









