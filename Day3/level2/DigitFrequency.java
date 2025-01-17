import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store frequency of digits (0-9)
        int[] frequency = new int[10];

        // Process each digit of the number
        int temp = Math.abs(number); // Handle negative numbers
        while (temp > 0) {
            int digit = temp % 10;
            frequency[digit]++;
            temp /= 10;
        }

        // Display the frequency of each digit
        System.out.println("\n--- Frequency of Digits ---");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}
