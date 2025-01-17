import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[256][2]; // 2 columns: character and frequency
        int index = 0;

        // Loop through the frequency array to populate the result array
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Store character
                result[index][1] = String.valueOf(frequency[i]); // Store frequency
                index++;
            }
        }

        // Resize the result array to the actual number of unique characters
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String[] entry : frequencies) {
            System.out.printf("'%s' : %s%n", entry[0], entry[1]);
        }

        scanner.close();
    }
}