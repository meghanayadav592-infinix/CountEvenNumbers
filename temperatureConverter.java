import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER TEMPERATURE IN CELSIUS: ");
        double temperatureInCelsius = scanner.nextDouble();

        double temperatureInFahrenheit = (temperatureInCelsius * 9 / 5) + 32;

        System.out.println("TEMPERATURE IN FAHRENHEIT: " + temperatureInFahrenheit);
        System.out.println("TEMPERATURE IN CELSIUS: " + temperatureInCelsius);

        scanner.close();
    }
}