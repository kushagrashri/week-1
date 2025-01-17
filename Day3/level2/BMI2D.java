import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create a 2D array to store height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3]; // [Height, Weight, BMI]
        String[] weightStatus = new String[numberOfPersons]; // Array to store status

        // Input height and weight
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Input and validate height
            while (true) {
                System.out.print("Enter height (in meters): ");
                personData[i][0] = input.nextDouble(); // Store height in column 0
                if (personData[i][0] > 0) break;
                System.out.println("Invalid height! Please enter a positive value.");
            }

            // Input and validate weight
            while (true) {
                System.out.print("Enter weight (in kg): ");
                personData[i][1] = input.nextDouble(); // Store weight in column 1
                if (personData[i][1] > 0) break;
                System.out.println("Invalid weight! Please enter a positive value.");
            }

            // Calculate BMI and store it in column 2
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", 
                personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        input.close();
    }
}
