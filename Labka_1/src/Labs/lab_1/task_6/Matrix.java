package Labs.lab_1.task_6;

import java.util.Scanner;

public class Matrix {

    private final int row;
    private final int col;
    private final int[][] a;

    public Matrix(final int rowCount, final int colCount) {
        this.row = rowCount;
        this.col = colCount;
        a = new int[rowCount][colCount];
    }

    public void Create() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("a[" + (i + 1) + "] [" + (j + 1) + "] = ");
                Scanner eS = new Scanner(System.in);
                a[i][j] = eS.nextInt();
            }
        }
    }

    public void Print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }

    public Matrix Multiply(final Matrix matrix) {

        final Matrix result = new Matrix(this.row, matrix.col);

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < matrix.col; j++) {
                for (int k = 0; k < matrix.row; k++) {
                    result.a[i][j] += (this.a[i][k] * matrix.a[k][j]);
                }
            }
        }
        return result;
    }

}
