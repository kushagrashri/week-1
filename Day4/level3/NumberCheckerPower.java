import java.util.Arrays;

public class NumberCheckerPower {

    // Method to find the count of digits in a number
    public static int findDigitCount(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sumOfDigits = sumOfDigits(number);
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[] freq = new int[10]; // Frequency array for digits 0-9
        for (int digit : digits) {
            freq[digit]++;
        }

        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;  // Store the digit
            result[i][1] = freq[i]; // Store the frequency
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 21; // Example number

        System.out.println("Number: " + number);

        // Count of digits
        System.out.println("Count of Digits: " + findDigitCount(number));

        // Sum of digits
        System.out.println("Sum of Digits: " + sumOfDigits(number));

        // Sum of squares of digits
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(number));

        // Harshad number check
        System.out.println("Is Harshad Number: " + isHarshadNumber(number));

        // Digit frequency
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit Frequency: ");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {  // Only print non-zero frequencies
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
            }
        }
    }
}
