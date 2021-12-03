package Labs.lab_1.task_3;

public class Main {
    public static void main(String[] args) {

        final int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        final char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        final String s = Mix(numbers, characters);
        System.out.println();
        System.out.println(s);

    }

    public static String Mix(final int[] numbers, final char[] characters) {
        String s = "";
        final int size = numbers.length + characters.length;

        for (int i = 0; i < size; i++) {
            if (i < numbers.length)
                s += numbers[i];
            if (i < characters.length)
                s += characters[i];
        }
        return s;
    }

    }



