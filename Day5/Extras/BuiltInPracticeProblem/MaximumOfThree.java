import java.util.Scanner;

public class MaximumOfThree {

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to calculate the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1; // Assume num1 is the largest
        if (num2 > max) {
            max = num2; // Update max if num2 is larger
        }
        if (num3 > max) {
            max = num3; // Update max if num3 is larger
        }
        return max;
    }

    public static void main(String[] args) {
        // Take three numbers as input from the user
        System.out.println("Enter three numbers to find the maximum:");
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");

        // Find the maximum of the three numbers
        int max = findMaximum(num1, num2, num3);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
