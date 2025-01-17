import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        System.out.println("Enter a natural number:");
        int number = input.nextInt();

        // Check if the input is a natural number
        if (number < 1) {
            System.err.println("Invalid input. Please enter a natural number greater than 0.");
            System.exit(0);
        }

        // Create arrays for odd and even numbers
        int[] odd = new int[(number + 1) / 2]; // Maximum odd numbers
        int[] even = new int[number / 2];      // Maximum even numbers

        // Index variables for odd and even numbers
        int oddIndex = 0;
        int evenIndex = 0;

        // Iterate from 1 to the number and segregate numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i; // Save even number
                evenIndex++;
            } else {
                odd[oddIndex] = i;   // Save odd number
                oddIndex++;
            }
        }

        // Print odd numbers array
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        // Print even numbers array
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        // Close the scanner
        input.close();
    }
}
