package Labs.lab_1.task_2;

public class Main {
    public static void main(String[] args) {

        final String[] array = {"apple", "orange", "watermelon", "pineapple", "banana", "mango", "nut", "cherry", "blackberry", "raspberry"};
        Print(array);
        final char character = 'e';

        int k = 0;
        for (int i =0;i<array.length;i++) {
            for (int j = 0; j < array[i].length(); j++) {

                final char c = array[i].charAt(j);
                if (c == character) {
                    k++;
                }
            }
        }

        System.out.println("");
        System.out.println("There are " + k + " characters '" + character + "'");
    }

    public static void Print(final String[] array) {
        for (final String s : array) {
            System.out.println(s);
        }
    }

}
