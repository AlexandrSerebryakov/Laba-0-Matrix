/**
 * Created by user on 07.10.2016.
 */
public class Runner {
    public static void main() {
       MatrixData matrix1 = new MatrixData(2, 2);
        MatrixData matrix2 = new MatrixData(2, 2);

        matrix1.fillRandom();
        matrix2.fillRandom();


        CounterMatrix.multiplyMatrix(matrix1, matrix2);

        System.out.println(matrix1);
        System.out.println(matrix2);



    }
}
