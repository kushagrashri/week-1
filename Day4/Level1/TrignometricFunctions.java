import java.util.Scanner;

class TrigonometricFunctions {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the angle in degrees
        System.out.print("Enter an angle in degrees: ");
        double angleInDegrees = input.nextDouble();

        // Call method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angleInDegrees);

        // Display the results
        System.out.println("Trigonometric values for angle " + angleInDegrees + " degrees:");
        System.out.printf("Sine: %.4f\n", results[0]);
        System.out.printf("Cosine: %.4f\n", results[1]);
        System.out.printf("Tangent: %.4f\n", results[2]);

        // Close the scanner
        input.close();
    }

    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle to radians
        double angleInRadians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        // Store results in an array
        return new double[]{sine, cosine, tangent};
    }
}
