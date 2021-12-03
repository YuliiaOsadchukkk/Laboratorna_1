package Labs.lab_1.task_10;

public class Day {
    private Weather weather = new Weather();
    private String name;

    public String getName() {
        return name;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setWeather(final Weather weather) {
        this.weather = weather;
    }
    
    public Day(final int atmPressure, final int averageTemperature, final double windSpeed, final int rainProbability, final int humidity, final String name) {
        this.name = name;
        this.weather.setAtmPressure(atmPressure);
        this.weather.setAverageTemperature(averageTemperature);
        this.weather.setWindSpeed(windSpeed);
        this.weather.setRainProbability(rainProbability);
        this.weather.setHumidity(humidity);
    }

    @Override
    public String toString() {
        return "Day: " + getName() + '\n' + getWeather().toString() + '\n';
    }
}
