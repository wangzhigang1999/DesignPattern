public class App {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        weatherData.registerObserver(new Observe("新浪"));
        weatherData.registerObserver(new Observe("京东"));
        weatherData.registerObserver(new Observe("天猫"));
        System.out.println("================");
        weatherData.notifyObserver();

        System.out.println("================");
        weatherData.setAirPressure(1.03f);
        System.out.println("================");
    }
}
