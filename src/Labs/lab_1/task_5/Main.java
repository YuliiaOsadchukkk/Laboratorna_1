package Labs.lab_1.task_5;
import java.util.Scanner;

public class Main extends Matrix{
    public static void main(String[] args) {

        System.out.println("Input high of matrix: ");
        Scanner i = new Scanner(System.in);
        int rowCount = i.nextInt();

        System.out.println("Input width of matrix: ");
        Scanner j = new Scanner(System.in);
        int colCount = j.nextInt();

        int[][] array = new int[rowCount][colCount];

        Create(array,rowCount,colCount);

        System.out.println();
        System.out.println("Created matrix:");
        Print(array,rowCount,colCount);

        System.out.println();
        System.out.println("Transponated matrix:");
        Transp(array,rowCount,colCount);

    }
}
