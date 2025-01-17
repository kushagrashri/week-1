import java.util.Scanner;
class DistancesConversion {
    public static void main(String[] args) {
		//Creating object of scanner class 
        Scanner input = new Scanner(System.in);
		
		//entering distance in feet by user
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
		
		//converting distance in feet to yard by formula
        double distanceInYards = distanceInFeet / 3;
		
		//converting distance in feet to miles by formula
        double distanceInMiles = distanceInYards / 1760;
		
		//displaying the result
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
		
		//closing the scanner class
        input.close();
    }
}
