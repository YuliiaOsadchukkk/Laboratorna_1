package Labs.lab_1.task_11;
import java.util.Arrays;

public class Taxi {
    private String carBrand;
    private String carColor;
    private String carNumbers;
    private int capacity;
    private Driver[] driver;

    public Driver[] getDriver() {
        return driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarColor() {
        return carColor;
    }

    public String getCarNumbers() {
        return carNumbers;
    }

    public void setCapacity(final int capacity) {
        this.capacity = capacity;
    }

    public void setCarBrand(final String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarColor(final String carColor) {
        this.carColor = carColor;
    }

    public void setDriver(final Driver[] driver) {
        this.driver = driver;
    }

    public void setCarNumbers(final String carNumbers) {
        this.carNumbers = carNumbers;
    }

    public Taxi(final String carBrand, final String carColor, final String carNumbers,final int capacity, final Driver[] driver ){
        this.capacity = capacity;
        this.driver = driver;
        this.carBrand = carBrand;
        this.carColor =carColor;
        this.carNumbers = carNumbers;
    }

    public Taxi (final String carNumbers){
        this.carNumbers = carNumbers;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Taxi taxi = (Taxi) o;
        return this.carNumbers == taxi.carNumbers;
    }

    @Override
    public int hashCode() {
        return 31 * this.getCarNumbers().hashCode();
    }

    @Override
    public String toString() {
        return "Car Numbers: " + carNumbers + '\n' +"Car Brand: " + carBrand + '\n' + "Car Color: " + carColor + '\n' +
                "Drivers: " +  Arrays.toString(driver) + '\n' + "Capacity: " + capacity+ '\n';
    }
}
