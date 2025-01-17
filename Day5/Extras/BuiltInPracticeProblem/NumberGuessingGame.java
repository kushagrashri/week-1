import java.util.Scanner;

public class NumberGuessingGame {

    // Generate a random guess within the range [min, max]
    public static int generateGuess(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    // Get user feedback on whether the guess is high, low, or correct
    public static String getUserFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is my guess high, low, or correct? ");
        return scanner.nextLine().toLowerCase();
    }

    // Update the range based on the user's feedback
    public static void updateRange(String feedback, int guess, int[] range) {
        if (feedback.equals("high")) {
            range[1] = guess - 1; // Update max
        } else if (feedback.equals("low")) {
            range[0] = guess + 1; // Update min
        }
    }

    public static void main(String[] args) {
        // Define the initial range
        int min = 1;
        int max = 100;

        // Explain the rules to the user
        System.out.println("Think of a number between " + min + " and " + max + ".");
        System.out.println("I will try to guess it!");
        System.out.println("Respond with 'high', 'low', or 'correct' to guide me.");

        // Initialize variables
        boolean guessedCorrectly = false;

        // Start guessing loop
        while (!guessedCorrectly) {
            // Generate a guess
            int guess = generateGuess(min, max);
            System.out.println("My guess is: " + guess);

            // Get feedback from the user
            String feedback = getUserFeedback();

            // Check the feedback
            if (feedback.equals("correct")) {
                System.out.println("Hurray! I guessed your number correctly!");
                guessedCorrectly = true;
            } else if (feedback.equals("high") || feedback.equals("low")) {
                // Update the range based on feedback
                updateRange(feedback, guess, new int[]{min, max});
                min = Math.max(min, 1); // Ensure min stays in bounds
                max = Math.min(max, 100); // Ensure max stays in bounds
            } else {
                System.out.println("Invalid input! Please respond with 'high', 'low', or 'correct'.");
            }
        }
    }
}
