package Labs.lab_1.task_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ////////////////   A   //////////////////////
        System.out.println("Input high of matrix A: ");
        Scanner i = new Scanner(System.in);
        int rowCount = i.nextInt();

        System.out.println("Input width of matrix A: ");
        Scanner j = new Scanner(System.in);
        int colCount = j.nextInt();

        int[][] array = new int[rowCount][colCount];
        final Matrix M1 = new Matrix(rowCount, colCount);
        M1.Create();

        ////////////////   B   //////////////////////
        System.out.println("We want to multiply AxB, so HIGH OF MATRIX B = width of matrix A =  " + colCount);
        int rowCount2 = colCount;

        System.out.println("Input width of matrix B: ");
        Scanner i2 = new Scanner(System.in);
        int colCount2 = i2.nextInt();

        int[][] array2 = new int[rowCount2][colCount2];
        final Matrix M2 = new Matrix(rowCount2, colCount2);
        M2.Create();

        //////////////   Print   ////////////////////
        System.out.println();
        System.out.println("Created matrix A:");
        M1.Print();

        System.out.println();
        System.out.println("Created matrix B:");
        M2.Print();

        ///////////////   AxB   /////////////////////
        System.out.println();
        System.out.println("AxB:");
        Matrix M3 = M1.Multiply(M2);
        M3.Print();

    }
}