package Labs.lab_1.task_9;


import Labs.lab_1.task_8.CustomDouble;

public class Main {
    public static void main(final String[] args) {
        final CustomDouble num1 = new CustomDouble(-3, 5.0);
        final CustomDouble num2 = new CustomDouble(1, 0.25);
        Calculator result = new Calculator();

        System.out.println("N1 = " + num1);
        System.out.println("N2 = " + num2);
        System.out.println("N1 + N2 = " + result.Manipulations(num1,"+",num2));
        System.out.println("N1 - N2 = " + result.Manipulations(num1,"-",num2));
        System.out.println("N1 * N2 = " + result.Manipulations(num1,"*",num2));
        System.out.println("N1 / N2 = " + result.Manipulations(num1,"/",num2));

    }
}

