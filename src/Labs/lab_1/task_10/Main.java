package Labs.lab_1.task_10;

public class Main {
    public static void main(final String[] args) {

        final Day[] oneWeek = new Day[7];
        oneWeek[0] = new Day(739,10,3.4,23,71,"Monday");
        oneWeek[1] = new Day(740,11,4.0,58,75,"Tuesday");
        oneWeek[2] = new Day(735,11,3.8,41,65,"Wednesday");
        oneWeek[3] = new Day(740,8,3.1,78,95,"Thursday");
        oneWeek[4] = new Day(740,12,2.3,32,87,"Friday");
        oneWeek[5] = new Day(739,16,2.3,39,79,"Saturday");
        oneWeek[6] = new Day(741,16,3.3,27,69,"Sunday");

        System.out.println();
        System.out.println("This is weather forecast on next week)):");
        for (int i = 0; i < oneWeek.length; i++) {
            System.out.println("----------------------------------------");
            System.out.println(oneWeek[i]);
        }

    }
}

