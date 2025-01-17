import java.util.Scanner;

public class Digitss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store digits
        int[] maxDigit = new int[10];
        int index = 0;

        // Extract digits and store them in the array
        while (number > 0) {
            if (index == maxDigit.length) {
                // Resize the array if needed
                int[] temp = new int[maxDigit.length + 10];
                System.arraycopy(maxDigit, 0, temp, 0, maxDigit.length);
                maxDigit = temp;
            }
            maxDigit[index] = number % 10; // Extract last digit
            number /= 10;                 // Remove the last digit
            index++;
        }

        // Variables to store the largest and second largest digits
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (maxDigit[i] > largest) {
                secondLargest = largest;
                largest = maxDigit[i];
            } else if (maxDigit[i] > secondLargest && maxDigit[i] != largest) {
                secondLargest = maxDigit[i];
            }
        }

        // Display the results
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);

        input.close();
    }
}

