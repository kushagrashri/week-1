import java.util.Scanner;

class PlayingWithNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create an array to store up to 10 numbers
        double[] numbers = new double[10];
        double total = 0.0; // Variable to store the total sum
        int index = 0;      // Index to track the number of entries

        // Infinite loop to take input until stopping condition
        while (true) {
            System.out.println("Enter number " + (index + 1) + " (Enter 0 or a negative number to stop):");
            double num = input.nextDouble();

            // Check for stopping condition
            if (num <= 0 || index == 10) {
                break;
            }

            // Store the entered number in the array
            numbers[index] = num;
            index++;
        }

        // Calculate the total of all entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all entered numbers
        System.out.println("You entered these numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the total sum
        System.out.println("The sum of all entered numbers is: " + total);
    }
}
