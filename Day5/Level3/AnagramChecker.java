import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false; // If lengths are not equal, they cannot be anagrams
        }

        // Create an array to store the frequency of characters (ASCII values)
        int[] frequency = new int[256]; // Assuming ASCII characters

        // Find the frequency of characters in the first text
        for (int i = 0; i < text1.length(); i++) {
            frequency[text1.charAt(i)]++; // Increment frequency for characters in text1
        }

        // Decrease the frequency based on the second text
        for (int i = 0; i < text2.length(); i++) {
            frequency[text2.charAt(i)]--; // Decrement frequency for characters in text2
        }

        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
                return false; // If any frequency is not zero, they are not anagrams
            }
        }

        return true; // All frequencies are zero, they are anagrams
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}