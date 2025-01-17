import java.util.Scanner;

public class CharacterFrequencyy {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert string to character array
        int[] frequency = new int[characters.length]; // Array to store frequency of each character

        // Loop through the characters to find the frequency
        for (int i = 0; i < characters.length; i++) {
            // If the character is already counted, skip it
            if (frequency[i] == 0) {
                frequency[i] = 1; // Initialize frequency for the current character

                // Inner loop to check for duplicates
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++; // Increment frequency for duplicates
                        frequency[j] = 0; // Mark duplicate character as counted
                    }
                }
            }
        }

        // Create a 1D String array to store the characters and their frequencies
        String[] result = new String[characters.length];
        int index = 0;

        // Populate the result array with characters and their frequencies
        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] > 0) { // Only include characters that were counted
                result[index] = characters[i] + " : " + frequency[i];
                index++;
            }
        }

        // Resize the result array to the actual number of unique characters
        String[] finalResult = new String[index];
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
        String[] frequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

        scanner.close();
    }
}