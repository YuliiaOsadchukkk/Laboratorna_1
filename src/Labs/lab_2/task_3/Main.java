package Labs.lab_2.task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
//    private static Object Subject;
//    private static Object Grade;

    public static void main(final String... args) {

        Map<Subject,Mark> markMap = new HashMap<>();

        final Student student1 = new Student("Yuliia", "Osadchuk", 2, "IT",markMap ,215011);

        System.out.println(student1);

        markMap.put(new Subject("Programing"),new Mark(5));
        markMap.put(new Subject("English"),new Mark(3));
        markMap.put(new Subject("Math"),new Mark(5));
        System.out.println(markMap);


    }
}