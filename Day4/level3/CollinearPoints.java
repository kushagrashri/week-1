import java.util.Scanner;

public class CollinearPoints {

    // Method to check if three points are collinear using the slope formula
    public static boolean arePointsCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // If all slopes are equal, the points are collinear
        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    // Method to check if three points are collinear using the area of triangle formula
    public static boolean arePointsCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // If the area is 0, the points are collinear
        return (area == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for the three points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check if the points are collinear using slope formula
        boolean areCollinearBySlope = arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear by slope? " + areCollinearBySlope);

        // Check if the points are collinear using area formula
        boolean areCollinearByArea = arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear by area? " + areCollinearByArea);

        // Checking if both methods agree
        if (areCollinearBySlope && areCollinearByArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }

        scanner.close();
    }
}
