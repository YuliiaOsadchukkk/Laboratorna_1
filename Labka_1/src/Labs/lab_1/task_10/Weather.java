package Labs.lab_1.task_10;

public class Weather {
      private int atmPressure;
      private int averageTemperature;
      private double windSpeed;
      private int rainProbability;
      private int humidity;

    public double getWindSpeed() {
        return windSpeed;
    }

    public int getAtmPressure() {
        return atmPressure;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getRainProbability() {
        return rainProbability;
    }

    public void setWindSpeed(final double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setAtmPressure(final int atmPressure) {
        this.atmPressure = atmPressure;
    }

    public void setAverageTemperature(final int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public void setHumidity(final int humidity) {
        this.humidity = humidity;
    }

    public void setRainProbability(final int rainProbability) {
        this.rainProbability = rainProbability;
    }


    Weather () { }

    Weather (final int atmPressure, final int averageTemperature, final double windSpeed, final int rainProbability, final int humidity){
        this.atmPressure = atmPressure;
        this.averageTemperature = averageTemperature;
        this.windSpeed = windSpeed;
        this.rainProbability = rainProbability;
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return  "Average temperature: " + getAverageTemperature() + "°C" + '\n'
                + "Probability of rain: " + getRainProbability() + "%" + '\n'
                + "Speed of wind: " + getWindSpeed() + "m/s" + '\n'
                + "Atmospheric pressure: " + getAtmPressure() + "mm" + '\n'
                + "Humidity: " + getHumidity() + "%";
    }
}
