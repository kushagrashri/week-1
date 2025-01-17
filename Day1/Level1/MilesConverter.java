import java.util.Scanner;
class MilesConverter{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		// Enter distance in kilometer
		System.out.println("enter the distance");
		double kilometer = input.nextDouble();
		
		// conerting distance into miles
		double miles = kilometer *0.621371;
		
		//Displaying the result
		System.out.println("The total miles is " + miles + "mile for the given " + " km");
		
		//closing scanner class
		input.close();
	}
}