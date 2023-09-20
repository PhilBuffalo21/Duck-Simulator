package WeatherApp;

public class CurrentDisplay implements Observer, DisplayElemets {
    private float tempature;
    private float humdity;

    @Override
    public void display() {
        System.out.println("Tempature: " + tempature);
        System.out.println("Humidity: " + humdity);
    }

    @Override
    public void update(float tempeture, float humdity, float pressure) {
        this.tempature = tempeture;
        this.humdity = humdity;
        display();
    }

}
