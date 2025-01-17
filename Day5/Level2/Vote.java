import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages for a given number of students
    public static int[] generateRandomAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(90) + 10; // Generate random age between 10 and 99
        }
        return ages;
    }

    // Method to determine voting eligibility based on age
    public static String[][] determineVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                results[i][1] = "false"; // Invalid age
            } else if (ages[i] >= 18) {
                results[i][1] = "true"; // Can vote
            } else {
                results[i][1] = "false"; // Cannot vote
            }
        }
        return results;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.println("Age\tCan Vote");
        System.out.println("----------------");
        for (String[] row : data) {
            System.out.printf("%s\t%s%n", row[0], row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages for the students
        int[] ages = generateRandomAges(numberOfStudents);

        // Determine voting eligibility
        String[][] eligibilityResults = determineVotingEligibility(ages);

        // Display the results
        displayResults(eligibilityResults);

        scanner.close();
    }
}
