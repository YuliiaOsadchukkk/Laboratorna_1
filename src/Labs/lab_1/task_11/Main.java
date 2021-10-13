package Labs.lab_1.task_11;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        final Driver[] drivers1 = new Driver[3];
        drivers1[0] = new Driver("Yaroslav", "Spyvak");
        drivers1[1] = new Driver("Taras", "Martyniv");
        drivers1[2] = new Driver("Bogdan", "Golubets");
        final Taxi car1 = new Taxi("Volkswagen", "black", "BK7950BC", 4, drivers1);

        final Driver[] drivers2 = new Driver[2];
        drivers2[0] = new Driver("Mykhailo", "Yanush");
        drivers2[1] = new Driver("Yaroslav", "Golubets");
        final Taxi car2 = new Taxi("Zhiguli", "red", "BA2588BA", 3, drivers2);

        final Driver[] drivers3 = new Driver[3];
        drivers3[0] = new Driver("Denys", "Borskyi");
        drivers3[1] = new Driver("Oksana", "Mint");
        drivers3[2] = new Driver("Orest", "Mykyteichuk");
        final Taxi car3 = new Taxi("Renault", "white", "BK1257BC", 6, drivers3);

        final Order ord = new Order();

        do {
            ord.Input();
            ord.SuitCar(car1);
            ord.SuitCar(car2);
            ord.SuitCar(car3);

            if (ord.EnoughCap(car1) == false && ord.EnoughCap(car2) == false && ord.EnoughCap(car3) == false) {
                    System.out.println("There isn't car capacity of which is enough for you");
                    System.out.println("Stop the order?(Input \"0\")");
                    System.out.println("Restart the order?(Input any other number)");
                    Scanner i = new Scanner(System.in);
                    int inp = i.nextInt();

                    if (inp == 0) {
                        System.exit(0);
                    }

            }
        } while (ord.EnoughCap(car1) == false && ord.EnoughCap(car2) == false && ord.EnoughCap(car3) == false);


            System.out.println("Input numbers of car you want to order:");
            Scanner c = new Scanner(System.in);
            String carN = c.nextLine();
            final Taxi car = new Taxi(carN);

            ord.Print();

        if(car.hashCode()==car1.hashCode()){
            System.out.print(car1);
        }
        if(car.hashCode()==car2.hashCode()){
            System.out.print(car2);
        }
        if(car.hashCode()==car3.hashCode()){
            System.out.print(car3);
        }
        System.out.println("------------------------------------------------------------------------------");

    }
}
