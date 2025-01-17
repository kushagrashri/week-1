import java.util.Scanner;

public class Euclidean
 {

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the equation of the line given two points (x1, y1) and (x2, y2)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope (m) of the line
        double slope = (y2 - y1) / (x2 - x1);
        
        // Calculate the y-intercept (b) using the formula y = mx + b
        double intercept = y1 - slope * x1;

        // Return the slope and intercept as an array
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points: " + distance);

        // Calculate the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];
        System.out.println("Equation of the line: y = " + slope + "x + " + intercept);

        scanner.close();
    }
}
