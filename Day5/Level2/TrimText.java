import java.util.Scanner;

public class TrimText{

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        // Trim spaces using custom method
        int[] trimIndices = trimSpaces(input);
        String trimmedCustom = createSubstring(input, trimIndices[0], trimIndices[1]);

        // Trim spaces using built-in method
        String trimmedBuiltIn = input.trim();

        // Compare the results
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("String after custom trim: '" + trimmedCustom + "'");
        System.out.println("String after built-in trim: '" + trimmedBuiltIn + "'");
        System.out.println("Are the results equal? " + isEqual);

        scanner.close();
    }
}
