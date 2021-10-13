package Labs.lab_2.task_1;

public class C3 extends C2 {
    public static int c3 = 3;
    private String name = "Class 3";

    public C3() {
        System.out.println(name + ": CONSTRUCTOR");
        System.out.println("  C3 : public static int c1 = " + c1);
        System.out.println("  C3 : public static int c2 = " + c2);
        System.out.println("  C3 : public static int c3 = " + c3);
    }

    {
        System.out.println("C3 non-static block");
    }

    static {
        System.out.println("C3 static block");
    }


}
