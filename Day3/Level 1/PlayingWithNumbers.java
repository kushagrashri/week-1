import java.util.Scanner;

class PlayingWithNumbers {
    public static void main(String[] args) {
        // Creating Scanner class object for taking input
        Scanner input = new Scanner(System.in);

        // Creating an array of size 5 and taking inputs
        int number[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1));
            number[i] = input.nextInt();
        }

        // Check if numbers are positive, negative, or zero
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 0) {
                System.out.println("The number " + number[i] + " is negative");
            } else if (number[i] > 0) {
                System.out.println("The number " + number[i] + " is positive");

                // Check if the positive number is even or odd
                if (number[i] % 2 == 0) {
                    System.out.println("The positive number " + number[i] + " is even");
                } else {
                    System.out.println("The positive number " + number[i] + " is odd");
                }

            } else {
                System.out.println("The number " + number[i] + " is zero");
            }
        }

        // Compare the first and last elements of the array
        for (int i = 0; i < number.length; i++) {
            if (number[0] == number[number.length - 1]) {
                System.out.println("The first and last element of the array are equal");
            } else if (number[0] > number[number.length - 1]) {
                System.out.println("The first element is greater than the last");
            } else {
                System.out.println("The last element is greater than the first");
            }
        }

        // Close the scanner
        input.close();
    }
}
