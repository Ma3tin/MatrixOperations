package cz.educanet.tranformations;

public class Main {
    public static void main(String[] args) {

        double[][] a = {
                {2, 5},
                {1, 5}
        };

        double[][] b = {
                {3, 4},
                {3, 4}
        };

        IMatrix matrixA = MatrixFactory.create(a);
        IMatrix matrixB = MatrixFactory.create(b);

        System.out.println(matrixA.get(0,0));
        System.out.println();

        IMatrix addMatrixToMatrix = matrixA.add(matrixB);
        printMatrix(addMatrixToMatrix);
        System.out.println();

        IMatrix timesWithScalar = matrixA.times(3.0);
        printMatrix(timesWithScalar);
        System.out.println();

        IMatrix timesWithMatrix = matrixA.times(matrixB);
        printMatrix(timesWithMatrix);


    }
    public static void printMatrix (IMatrix m) {
        for (int i = 0; i < m.getRows(); i++) {
            for (int j = 0; j < m.getColumns(); j++) {
                System.out.print(m.get(i, j) + ", ");
            }
            System.out.println();
        }
    }
}
