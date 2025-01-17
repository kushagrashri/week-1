import java.util.Scanner;

public class Factorial {

    // Function to calculate factorial using recursion
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    // Function to get input from the user
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return scanner.nextInt();
    }

    // Function to display the result
    public static void displayResult(int number, int result) {
        System.out.println("The factorial of " + number + " is " + result);
    }

    public static void main(String[] args) {
        int num = getInput();
        int result = calculateFactorial(num);
        displayResult(num, result);
    }
}
