import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert character to lowercase
        char lowerChar = Character.toLowerCase(ch);

        // Check if the character is a letter
        if (lowerChar >= 'a' && lowerChar <= 'z') {
            // Check if the letter is a vowel
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to process the input string and return results in a 2D array
    public static String[][] processString(String input) {
        String[][] result = new String[input.length()][2];

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = checkCharacterType(currentChar);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResult(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("--------------------");
        for (String[] row : data) {
            System.out.printf("%s\t\t%s%n", row[0], row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Process the input string
        String[][] result = processString(input);

        // Display the result
        displayResult(result);

        scanner.close();
    }
}
