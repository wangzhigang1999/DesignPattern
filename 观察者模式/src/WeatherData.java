import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperature;
    private float airPressure;
    private float humidity;
    private ArrayList<Observer> observes;

    public WeatherData() {
        this.observes = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    public float getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(float airPressure) {
        this.airPressure = airPressure;
        notifyObserver();
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observes.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observe : observes) {
            observe.update(getTemperature(), getAirPressure(), getHumidity());
        }
    }
}
