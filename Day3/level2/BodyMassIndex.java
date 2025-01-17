import java.util.Scanner;

public class BodyMassIndex{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create arrays to store height, weight, BMI, and status
        double[] height = new double[numberOfPersons];
        double[] weight = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];

        // Take input for height and weight
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Input and validate height
            while (true) {
                System.out.print("Enter height (in meters): ");
                height[i] = input.nextDouble();
                if (height[i] > 0) break;
                System.out.println("Invalid height! Please enter a positive value.");
            }

            // Input and validate weight
            while (true) {
                System.out.print("Enter weight (in kg): ");
                weight[i] = input.nextDouble();
                if (weight[i] > 0) break;
                System.out.println("Invalid weight! Please enter a positive value.");
            }

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", height[i], weight[i], bmi[i], status[i]);
        }

        input.close();
    }
}
