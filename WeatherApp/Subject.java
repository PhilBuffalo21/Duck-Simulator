package WeatherApp;

public interface Subject {
    public void RegisterAnObserver(Observer o);

    public void RemoveAnObserver(Observer o);

    public void notifyObservers();
}
