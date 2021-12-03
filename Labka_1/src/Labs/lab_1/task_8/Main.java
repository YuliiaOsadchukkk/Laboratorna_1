package Labs.lab_1.task_8;

public class Main {
    public static void main(final String[] args) {
        final CustomDouble num1 = new CustomDouble( 3, 2.0);
        final CustomDouble num2 = new CustomDouble( 2, 3.0);

        System.out.println("N1 = " + num1);
        System.out.println("N2 = " + num2);

        System.out.println("N1 + N2 = " + num1.add(num2));
        System.out.println("N1 - N2 = : " + num1.sub(num2));

        System.out.println("N1 >= N2 ?  " + num1.moreThanAndEqual(num2));
        System.out.println("N1 < N2  ?  " + num1.lessThan(num2));
        System.out.println("N1 <= N2 ?  " + num1.lessThanAndEqual(num2));
        System.out.println("N1 > N2  ?  " + num1.moreThan(num2));
        System.out.println("N1 == N2 ?  " + num1.equals(num2));
        System.out.println("N1 != N2 ?  " + num1.notEqual(num2));

        System.out.println("HashCode N1: " + num1.hashCode());
        System.out.println("HashCode N2: " + num2.hashCode());
    }
}
