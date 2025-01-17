import java.util.Scanner;

public class SplitTextToWords {

    public static void main(String[] args) {
        // Taking user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        // Splitting the text into words
        String[] words = splitTextIntoWords(sentence);

        // Creating a 2D array with words and their lengths
        String[][] wordLengths = getWordLengths(words);

        // Displaying the result in tabular format
        System.out.printf("%-10s | %-10s\n", "Word", "Length");
        System.out.println("--------------------------");
        for (String[] wordLength : wordLengths) {
            System.out.printf("%-10s | %-10d\n", wordLength[0], Integer.parseInt(wordLength[1]));
        }
    }

    // Method to split the text into words without using split()
    public static String[] splitTextIntoWords(String text) {
        int spaceCount = 0;

        // Count spaces to determine the number of words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Create an array to store the words
        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        int start = 0;

        // Extract words using spaces
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }

        // Add the last word
        words[wordIndex] = text.substring(start);

        return words;
    }

    // Method to find the length of a string without using length()
    public static int findStringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; // Store the word
            wordLengths[i][1] = String.valueOf(findStringLength(words[i])); // Store the length as String
        }

        return wordLengths;
    }
}
