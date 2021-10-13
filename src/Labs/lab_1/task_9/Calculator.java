package Labs.lab_1.task_9;
import Labs.lab_1.task_8.CustomDouble;


public class Calculator {
    public double Manipulations(final CustomDouble a,String symbol, final CustomDouble b) {
        switch(symbol) {
            case "+":
                return a.add(b).toDouble();
            case "-":
                return a.sub(b).toDouble();
            case "*":
                return a.mult(b).toDouble();
            case "/":
                return a.divis(b).toDouble();
            default:
                System.out.println("Operation is wrong");
                return 0;
        }
    }




    }

