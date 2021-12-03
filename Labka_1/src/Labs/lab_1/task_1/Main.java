package Labs.lab_1.task_1;

public class Main {
    public static void main(final String[] args) {

        final String[] array = {"apple", "orange", "watermelon", "pineapple", "banana", "mango", "nut", "cherry", "blackberry", "raspberry"};
        Print(array);
        Sort(array);
        Print(array);
    }

    public static void Sort(final String[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if ((array[i].length()) > (array[i + 1].length())) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    public static void Print(final String[] array) {
        for (final String s : array) {
            System.out.println(s);
        }
    }

}





