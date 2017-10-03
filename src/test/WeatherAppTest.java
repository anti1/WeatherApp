package test;

import main.WeatherApp;
import main.WeatherItem;
import org.junit.Test;
import org.junit.Assert;

public class WeatherAppTest {

    @Test
    public void getCurrentWeatherIsTemperatureInCityUnder70() {

        WeatherApp app = new WeatherApp();
        String city = "Las Vegas";
        double temp = 70;

        WeatherItem weather = app.getCurrentWeather(city);

        Assert.assertNotEquals(temp, weather.getTemperature());
    }

    @Test
    public void getMaxTemperatureIsTemperatureMax() {
        WeatherApp app = new WeatherApp();
        String city = "Tallinn";
        double temp = 15;

        WeatherItem maxTemp = app.getMaxTemperature(city);

        Assert.assertEquals(temp, maxTemp.getMaxTemp());
    }

    @Test
    public void getCoordinatesAreCoordinatesOk() {
        WeatherApp app = new WeatherApp();
        String city = "Tallinn";
        double latitudeTallinn = 59.4370;
        double longitudeTallinn = 24.7536;

        WeatherItem latitude = app.getLatitude(city);
        WeatherItem longitude = app.getLongitude(city);

        Assert.assertEquals(latitudeTallinn, latitude.getLatitude());
        Assert.assertEquals(longitudeTallinn, longitude.getLongitude());

    }
}
