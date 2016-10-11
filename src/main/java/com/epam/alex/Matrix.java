package com.epam.alex;

import java.util.Random;

/**
 * Created by user on 07.10.2016.
 */

public class Matrix {

    private int data[][];

    public Matrix(int row, int col) {

        this.data = new int[row][col];

    }



    public void fillRandom(int range){
         for (int i = 0; i < getRow(); i++){
           for (int j = 0; j < getCol(); j++){

              data[i][j]=new Random().nextInt(range);
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

    public void setRow(int i, int j, int value) {data[i][j]=value;
    }

    //public void setValue (int i, int j, int data){
       //int data[][] ;
    //}


}









