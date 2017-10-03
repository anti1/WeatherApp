package main;

public class WeatherItem {
    public double getTemperature() {
        return temperature;
    }
    public double getMaxTemp() {
        return maxTemp;
    }
    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    private double temperature;
    private double maxTemp;
    private double longitude;
    private double latitude;

    public WeatherItem(double temperature, double maxTemp, double longitude, double latitude) {

        this.temperature = temperature;
        this.maxTemp = maxTemp;
        this.longitude = longitude;
        this.latitude = latitude;
    }

}
