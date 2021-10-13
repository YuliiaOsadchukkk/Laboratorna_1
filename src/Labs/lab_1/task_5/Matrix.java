package Labs.lab_1.task_5;
import java.util.Scanner;

public class Matrix {

    public static void Create(int[][] a, final int rowCount, final int colCount) {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                System.out.println("a[" + (i+1) +"] [" + (j+1) + "] = ");
                Scanner eS = new Scanner(System.in);
                a[i][j] = eS.nextInt();
            }
        }
    }

    public static void Print(int[][] a, final int rowCount, final int colCount) {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }

    public static void Transp(int[][] a, final int rowCount, final int colCount) {
        for (int i = 0; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                System.out.print("  " + a[j][i]);
            }
            System.out.println();
        }
    }

}
