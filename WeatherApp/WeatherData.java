package WeatherApp;

import java.util.ArrayList;

public class WeatherData implements Subject {
    ArrayList<Observer> observers = new ArrayList<>();
    private float tempature;
    private float humidity;
    private float pressure;

    @Override
    public void RegisterAnObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void RemoveAnObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {// i < 0 means it does not exist.
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(tempature, humidity, pressure);
        }
    }

    public void setMeasurements(float t, float h, float p) {
        this.tempature = t;
        this.humidity = h;
        this.pressure = p;
        notifyObservers();
    }
}
