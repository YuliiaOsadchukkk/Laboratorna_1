package Labs.lab_1.task_4;

public class Main
{
    public static void main(String[] args) {
                FizzOrBuzz();
    }

    public static void FizzOrBuzz() {
        for(int i = 1; i<=100; i++) {

            int a = i % 3;
            int b = i % 5;

            if (a==0 && b!=0) {
                System.out.println("Fizz");
            }
            if (a!=0 && b==0) {
                System.out.println("Buzz");
            }
            if (a==0 && b==0) {
                System.out.println("FizzBuzz");
            }
            if (a!=0 && b!=0) {
                System.out.println(i);
            }
        }
    }
}

