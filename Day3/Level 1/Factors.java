import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        System.out.println("Enter a natural number:");
        int number = input.nextInt();

        // Validate input
        if (number < 1) {
            System.err.println("Invalid input. Please enter a natural number greater than 0.");
            System.exit(0);
        }

        // Initialize variables
        int maxFactor = 10; // Initial size of the array
        int[] factor = new int[maxFactor];
        int index = 0;

        // Finding factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize the array if needed
                if (index == factor.length) {
                    maxFactor *= 2; // Double the size
                    int[] temp = new int[maxFactor];
                    for (int k = 0; k < factor.length; k++) {
                        temp[k] = factor[k];
                    }
                    factor = temp; // Assign resized array
                }
                // Add factor to the array
                factor[index] = i;
                index++;
            }
        }

        // Print the factors
        System.out.println("The factors of the given number are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factor[i] + " ");
        }
        System.out.println();

        // Close the scanner
        input.close();
    }
}
