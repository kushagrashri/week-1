import java.util.Scanner;

public class Modify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initial size for the digits array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number > 0) {
            if (index == maxDigit) {
                // Increase maxDigit size by 10
                maxDigit += 10;
                // Create a temporary array with new size
                int[] temp = new int[maxDigit];
                // Copy old digits array to temp array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                // Assign the temp array back to digits
                digits = temp;
            }
            digits[index] = number % 10; // Extract the last digit
            number /= 10;                // Remove the last digit
            index++;
        }

        // Variables to store the largest and second largest digits
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);

        input.close();
    }
}
