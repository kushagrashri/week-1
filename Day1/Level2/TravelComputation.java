import java.util.Scanner;

class TravelComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user inputs for name and cities
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        // Take user inputs for distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = input.nextDouble();

        // Take user inputs for time in minutes
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = input.nextInt();

        // Calculate total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Display the results
        System.out.println("\nThe total distance travelled by " + name + " from " + fromCity + " to " + toCity + 
                           " via " + viaCity + " is " + totalDistance + " miles, and the total time taken is " + 
                           totalTime + " minutes.");
		//Closing the scanner class
		input.close();
    }
}
