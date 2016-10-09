package com.epam.alex;

/**
 * Created by user on 07.10.2016.
 */

public class Matrix {
    private int row;
    private int col;
    private int matrix[][];

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        fillRandom(row, col);

    }

    public void  fillRandom(int m, int n){
         matrix = new int[m][n];
        for (int i = 0; i < m; i++){
           for (int j = 0; j < n; j++){

               matrix[i][j]=(int) (Math.random()*5);
           }
        }

    }

    public int getRow() {
        return matrix.length;
    }

    public int getCol() {
        return matrix[0].length;
    }

    public int getData (int i, int j){
        return matrix[i][j];
    }
    //public int setData (int i, int j, int data){
    //    return tab[i][j] = data;
    //}
}









