import java.util.Scanner;
class Athlete{
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//enter first side of traingle
        System.out.print("Enter the first side of the triangle in meters: ");
        double side1 = input.nextDouble();
		
		//enter second side of traingle
        System.out.print("Enter the second side of the triangle in meters: ");
        double side2 = input.nextDouble();
		
		//enter third side of traingle
        System.out.print("Enter the third side of the triangle in meters: ");
        double side3 = input.nextDouble();
		
		//calculating perimiter of park
        double perimeter = side1 + side2 + side3;
        double distanceInMeters = 5000;
        double rounds = distanceInMeters / perimeter;
		
		//displaying result
        System.out.println("The total number of rounds the athlete will run is " + (int)Math.ceil(rounds) + " to complete 5 km.");
		
		//closing scanner class
		input.close();
    }
}
