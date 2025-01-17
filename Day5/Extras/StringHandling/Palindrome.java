import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        // Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text to check for palindrome: ");
        String text = input.nextLine();
        
        // Remove spaces and convert to lowercase
        text = text.toLowerCase();
        text = text.trim();
        
        // Reverse the string
        String reverseText = reverseString(text);

        // Check if the text is a palindrome
        if (check(text, reverseText)) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }

    // Method to reverse the string
    public static String reverseString(String text) {
        // Converting string to character array
        char[] originalString = text.toCharArray();
        char[] newString = new char[originalString.length];
        
        // Reversing the string
        for (int i = 0, j = originalString.length - 1; i < originalString.length; i++, j--) {
            newString[j] = originalString[i];
        }
        
        // Returning the reversed string
        return new String(newString);
    }

    // Method to check if the original string and reversed string are equal
    public static boolean check(String text, String reverseText) {
        return text.equals(reverseText);  // Compare the original and reversed strings
    }
}
