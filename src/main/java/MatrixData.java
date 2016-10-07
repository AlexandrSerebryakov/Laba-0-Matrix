/**
 * Created by user on 07.10.2016.
 */
public class MatrixData {

    private int rows;
    private int columns;
    private int[][] tab;

    public MatrixData(int rows, int columns) {
        this.rows=rows;
        this.columns=columns;
        matrixFill(rows, columns);
            }
    public void matrixFill(int m, int n){
        tab=new int[m][n];
        m=3;
        n=3;

    }


}
