import java.util.Scanner;

public class temperature 
{
    // Conversion methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("---------------------");
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");

        int choice = sc.nextInt();

        System.out.print("Enter the temperature value: ");
        double value = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = celsiusToFahrenheit(value);
                System.out.println(value + " °C = " + result + " °F");
                break;
            case 2:
                result = fahrenheitToCelsius(value);
                System.out.println(value + " °F = " + result + " °C");
                break;
            case 3:
                result = celsiusToKelvin(value);
                System.out.println(value + " °C = " + result + " K");
                break;
            case 4:
                result = kelvinToCelsius(value);
                System.out.println(value + " K = " + result + " °C");
                break;
            case 5:
                result = fahrenheitToKelvin(value);
                System.out.println(value + " °F = " + result + " K");
                break;
            case 6:
                result = kelvinToFahrenheit(value);
                System.out.println(value + " K = " + result + " °F");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
