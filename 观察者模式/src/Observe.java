public class Observe implements Observer {
    private String name;
    private float temperature;
    private float airPressure;
    private float humidity;

    public Observe(String name) {
        this.name = name;
    }

    public void update(float temperature, float airPressure, float humidity) {
        this.temperature = temperature;
        this.airPressure = airPressure;
        this.humidity = humidity;
        System.out.println(display());
    }


    public String display() {
        return "Observe{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", airPressure=" + airPressure +
                ", humidity=" + humidity +
                '}';
    }
}
