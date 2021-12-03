package Labs.lab_2.task_1;


    public class C1 {

        public static int c1 = 1;
        private String name = "Class 1";

        public C1() {
            System.out.println(name + ": CONSTRUCTOR");
            System.out.println("  C1 : public static int a = " + c1);
        }

        {
            System.out.println("C1 non-static block ");
        }

        static {
            System.out.println("C1 static block ");
        }










    }

