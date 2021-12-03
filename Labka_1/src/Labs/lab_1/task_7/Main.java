package Labs.lab_1.task_7;

public class Main {
    public static void main(String[] args) {
        User U1 = new User("Yuliia","Osadchuk", 18, "uwu@gmail.com");
        User U2 = new User("Yuliia","Osadchuk", 18, "tututu@gmail.com");

        System.out.println();
        System.out.print("Are they equal? ");
        System.out.println(U1.equals(U2));

        System.out.print("First user's hashCode:  ");
        System.out.println(U1.hashCode());
        System.out.print("Second user's hashCode: ");
        System.out.println(U2.hashCode());
    }
}
