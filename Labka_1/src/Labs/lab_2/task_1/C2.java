package Labs.lab_2.task_1;

public class C2 extends C1 {

    public static int c2 = 2;
    private String name = "Class 2";

    public C2() {
        System.out.println(name + ": CONSTRUCTOR");
        System.out.println("  C2 : public static int c1 = " + c1);
        System.out.println("  C2 : public static int c2 = " + c2);
    }

    static {
        System.out.println("C2 static block");
    }

    {
        System.out.println("C2 non-static block");
    }

    }

