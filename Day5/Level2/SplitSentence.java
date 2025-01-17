import java.util.Scanner;

class SplitSentence {
    public static void main(String[] args) {
        // Creating scanner class object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter Sentence:");
        String sentence = input.nextLine();

        // Counting words
        int wordCount = countWords(sentence);
        System.out.println("Number of words: " + wordCount);

        // Getting space indexes
        int[] spaceIndexes = getSpaceIndexes(sentence);
        System.out.print("Space indexes: ");
        for (int index : spaceIndexes) {
            System.out.print(index + " ");
        }
        System.out.println();

        // Extracting words using space indexes
        String[] userDefinedWords = extractWords(sentence, spaceIndexes);
        System.out.println("Words in the text (user-defined):");
        for (String word : userDefinedWords) {
            System.out.println(word);
        }

        // Extracting words using built-in split()
        String[] builtInWords = sentence.split("\\s+");
        System.out.println("Words in the text (built-in split):");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Comparing the two arrays
        boolean areEqual = compareStringArrays(userDefinedWords, builtInWords);
        System.out.println("Are the two string arrays equal? " + (areEqual ? "Yes" : "No"));
    }

    // Method to count spaces in a sentence and store their indexes in an array
    public static int[] getSpaceIndexes(String sentence) {
        int spaceCount = 0;

        // Count spaces
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Create an array to store space indexes
        int[] spaceIndexes = new int[spaceCount];
        int index = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        return spaceIndexes;
    }

    // Method to store words in an array and access them using indexes
    public static String[] extractWords(String sentence, int[] spaceIndexes) {
        String[] words = new String[spaceIndexes.length + 1];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            words[i] = sentence.substring(start, end); // Extract word
            start = end + 1; // Update start for the next word
        }

        // Last word (after the final space)
        words[spaceIndexes.length] = sentence.substring(start);

        return words;
    }

    // Method to count words in a sentence without using split() function
    public static int countWords(String sentence) {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                if (!inWord) {
                    inWord = true;
                    wordCount++;
                }
            } else {
                inWord = false; // Encountered space
            }
        }

        return wordCount;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true; // All elements are equal
    }
}
