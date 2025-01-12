package Assigment3.Task32;

public class Task32 {
    public static void showWeather(City city) {
        System.out.println("In the city " + city.getName() + " today, the temperature is " + city.getTemperature());
    }
    public static void main(String[] args) {
        City city = new City("Dubai", 40);

        showWeather(city);
    }
}
