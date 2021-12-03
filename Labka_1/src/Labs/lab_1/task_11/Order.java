package Labs.lab_1.task_11;

import java.util.Scanner;

public class Order {
    private String startPlace;
    private String goalPlace;
    private int passengersCount;
    private Taxi car;

    public int getPassengersCount() {
        return passengersCount;
    }


    public String getGoalPlace() {
        return goalPlace;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public Taxi getCar() {
        return car;
    }

    public void setCar(final Taxi car) {
        this.car = car;
    }

    public void setGoalPlace(final String goalPlace) {
        this.goalPlace = goalPlace;
    }

    public void setPassengersCount(final int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public void setStartPlace(final String startPlace) {
        this.startPlace = startPlace;
    }

    public Order(final String startPlace, final String goalPlace, final int passengersCount, final Taxi car){
        this.startPlace = startPlace;
        this.goalPlace = goalPlace;
        this.passengersCount = passengersCount;
        this.car = car;
    }

    public Order(){
    }

    public boolean EnoughCap(Taxi car){
        return passengersCount<=car.getCapacity();
    }

    public void SuitCar(Taxi car){
        if(EnoughCap(car) == true){
            System.out.println(car);
        }
    }


    public void Input(){
        System.out.println("Input start place:");
        Scanner s = new Scanner(System.in);
        this.startPlace = s.nextLine();

        System.out.println("Input goal place:");
        Scanner g = new Scanner(System.in);
        this.goalPlace = g.nextLine();

        System.out.println("Input count of passengers:");
        Scanner pc = new Scanner(System.in);
        this.passengersCount = pc.nextInt();
    }

    public void Print(){
        System.out.println("----------------------------------Your order----------------------------------");
        System.out.println("Start place: "+this.startPlace);
        System.out.println("Goal place: "+this.goalPlace);
        System.out.println("Count of passengers: "+this.passengersCount);
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Order order = (Order) o;
        return startPlace == order.startPlace && goalPlace == order.goalPlace && passengersCount == order.passengersCount && car == order.car;
    }

    @Override
    public int hashCode() {
        return 31 * this.getStartPlace().hashCode() + 31 * this.getGoalPlace().hashCode() + 31 * this.getPassengersCount() + 31 * this.getCar().hashCode();
    }

}
