package WeatherApp;

public class WeatherClient {
    public static void main(String[] args) {
        WeatherData weather = new WeatherData();
        Observer current = new CurrentDisplay();
        weather.RegisterAnObserver(current);
        weather.setMeasurements(24, 2, 3);

    }
}
