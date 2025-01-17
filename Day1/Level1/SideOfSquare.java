import java.util.Scanner;
class SideOfSquare{
    public static void main(String[] args) {
		// Creating a Scanner object for user input
        Scanner input = new Scanner(System.in); 

        // enter the perimeter by user
        System.out.print("Enter the perimeter of the square ");
        double perimeter = input.nextDouble();

        // Calculating the side of the square
        double side = perimeter / 4;

        // Displaying result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		
		// Closing scanner class
		input.close(); 
    }
}
