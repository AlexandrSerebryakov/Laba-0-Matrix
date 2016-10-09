package com.epam.alex;

/**
 * Created by user on 07.10.2016.
 */

public class MatrixCreateFill { //
    private int row;            //
    private int col;            //
    private int matrix[][];     //

    public MatrixCreateFill(int row, int col) {
        this.row = row;
        this.col = col;
        fillRandom(row, col);

    }

    public void  fillRandom(int m, int n){
         tab = new int[m][n];
        for (int i = 0; i < m; i++){
           for (int j = 0; j < n; j++){

               tab[i][j]=(int) (Math.random()*5);
           }
        }

    }

    public int getRow() {
        return tab.length;
    }

    public int getCol() {
        return tab[0].length;
    }

    public int getTab(int i, int j) {
        return tab[i][j];
    }

    public int getData (int i, int j){
        return tab[i][j];
    }
    //public int setData (int i, int j, int data){
    //    return tab[i][j] = data;
    //}
}









