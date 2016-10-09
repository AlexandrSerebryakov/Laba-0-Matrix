import java.util.Random;

/**
 * Created by user on 07.10.2016.
 */

public class MatrixData{
    private int row;
    private int col;
    private int tab[][];

    public MatrixData(int row, int col) {
        this.row = row;
        this.col = col;
        //fillRandom(row, col);

    }

    public void  fillRandom(int range){

        for (int i = 0; i < getRow(); i++){
           for (int j = 0; j < getCol(); j++){
               tab[i][j]=new Random().nextInt(range);
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
    public int setData (int i, int j, int data){
        return tab[i][j] = data;
    }
    public int getData (int i, int j){
        return tab[i][j];
    }
}









