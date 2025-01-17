import java.util.Arrays;

public class DuckArray {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome using its digits
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true; // It is a duck number if there is at least one non-zero digit
            }
        }
        return false; // If all digits are zero, it's not a duck number
    }

    public static void main(String[] args) {
        int number = 121; // Example number
        int duckNumber = 1050; // Example duck number

        System.out.println("Number: " + number);
        
        // Count of digits
        System.out.println("Count of Digits: " + findDigitCount(number));

        // Check if the number is a palindrome
        System.out.println("Is Palindrome: " + isPalindrome(number));

        // Check if the number is a duck number
        System.out.println("Is Duck Number: " + isDuckNumber(duckNumber));

        // Display reversed digits array
        int[] digits = storeDigits(number);
        System.out.println("Reversed Digits: " + Arrays.toString(reverseDigits(digits)));
    }
}
