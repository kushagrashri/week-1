import java.util.Scanner;

public class ShortestAndLongestString {

    public static void main(String[] args) {
        // Taking user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        // Splitting the text into words
        String[] words = splitTextIntoWords(sentence);

        // Creating a 2D array with words and their lengths
        String[][] wordLengths = getWordLengths(words);

        // Finding the shortest and longest words
        int[] shortestAndLongestIndexes = findShortestAndLongest(wordLengths);

        // Displaying the words with their lengths
        System.out.printf("%-10s | %-10s\n", "Word", "Length");
        System.out.println("--------------------------");
        for (String[] wordLength : wordLengths) {
            System.out.printf("%-10s | %-10s\n", wordLength[0], wordLength[1]);
        }

        // Displaying the shortest and longest words
        System.out.println("\nShortest word: " + wordLengths[shortestAndLongestIndexes[0]][0]
                + " (Length: " + wordLengths[shortestAndLongestIndexes[0]][1] + ")");
        System.out.println("Longest word: " + wordLengths[shortestAndLongestIndexes[1]][0]
                + " (Length: " + wordLengths[shortestAndLongestIndexes[1]][1] + ")");
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

    // Method to find the shortest and longest words
    public static int[] findShortestAndLongest(String[][] wordLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordLengths[0][1]);
        int longestLength = Integer.parseInt(wordLengths[0][1]);

        for (int i = 1; i < wordLengths.length; i++) {
            int currentLength = Integer.parseInt(wordLengths[i][1]);

            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[] { shortestIndex, longestIndex };
    }
}
