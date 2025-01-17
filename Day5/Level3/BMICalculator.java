import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status for each person
    public static String[][] calculateBMI(double[][] weightHeight) {
        String[][] bmiInfo = new String[weightHeight.length][4]; // 4 columns: Weight, Height, BMI, Status
        
        for (int i = 0; i < weightHeight.length; i++) {
            double weight = weightHeight[i][0];
            double heightInMeters = weightHeight[i][1] / 100; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula
            
            bmiInfo[i][0] = String.valueOf(weight); // Weight
            bmiInfo[i][1] = String.valueOf(weightHeight[i][1]); // Height in cm
            bmiInfo[i][2] = String.format("%.2f", bmi); // BMI formatted to 2 decimal places
            
            // Determine BMI status
            if (bmi < 18.5) {
                bmiInfo[i][3] = "Underweight";
            } else if (bmi < 24.9) {
                bmiInfo[i][3] = "Normal weight";
            } else if (bmi < 29.9) {
                bmiInfo[i][3] = "Overweight";
            } else {
                bmiInfo[i][3] = "Obesity";
            }
        }
        return bmiInfo;
    }

    // Method to display the BMI information in a tabular format
    public static void displayBMIInfo(String[][] bmiInfo) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        System.out.println("------------------------------------------");
        for (String[] info : bmiInfo) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", info[0], info[1], info[2], info[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] weightHeight = new double[10][2]; // 10 persons, 2 columns (weight, height)

        // Taking user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter weight (in kg) for person %d: ", i + 1);
            weightHeight[i][0] = scanner.nextDouble(); // Weight
            System.out.printf("Enter height (in cm) for person %d: ", i + 1);
            weightHeight[i][1] = scanner.nextDouble(); // Height
        }

        // Calculate BMI and status
        String[][] bmiInfo = calculateBMI(weightHeight);

        // Display the results
        displayBMIInfo(bmiInfo);

        scanner.close();
    }
}