import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to get input from the user
    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to display the result
    public static void displayResult(double result) {
        System.out.println("The converted temperature is: " + result);
    }

    public static void main(String[] args) {
        double fahrenheit = getInput("Enter temperature in Fahrenheit: ");
        double celsius = fahrenheitToCelsius(fahrenheit);
        displayResult(celsius);

        double celsiusInput = getInput("Enter temperature in Celsius: ");
        double fahrenheitOutput = celsiusToFahrenheit(celsiusInput);
        displayResult(fahrenheitOutput);
    }
}
