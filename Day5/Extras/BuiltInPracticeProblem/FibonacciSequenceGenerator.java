import java.util.Scanner;

public class FibonacciSequenceGenerator {

    // Function to calculate and print the Fibonacci sequence up to a given number of terms
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        // Handle cases for 1 or 2 terms
        if (terms >= 1) {
            System.out.print(first + " ");
        }
        if (terms >= 2) {
            System.out.print(second + " ");
        }

        // Calculate and print Fibonacci sequence for terms greater than 2
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println(); // Newline after printing the sequence
    }

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Take number of terms as input from the user
        int terms = getInput("Enter the number of terms in the Fibonacci sequence: ");
        
        // Validate input
        if (terms <= 0) {
            System.out.println("Please enter a positive number for the terms.");
        } else {
            // Generate and print the Fibonacci sequence
            System.out.print("Fibonacci sequence up to " + terms + " terms: ");
            generateFibonacci(terms);
        }
    }
}
