/**
 * Created by user on 07.10.2016.
 */
public class Runner {
    public static void main() {
       MatrixData matrix1 = new MatrixData(2, 2);
        MatrixData matrix2 = new MatrixData(2, 2);

        matrix1.fillRandom(2, 2);
        matrix2.fillRandom(2, 2);
        //MatrixData m1 = matrix1.fillRandom(2, 2);
        //MatrixData m2 = matrix2.fillRandom(2, 2);

        CounterMatrix.multiplyMatrix(matrix1, matrix2);


    }
}
