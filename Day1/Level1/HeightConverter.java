import java.util.Scanner;
class HeightConverter{
	public static void main(String [] args){
		//importing scanner class and creating object
		Scanner input = new Scanner(System.in);
		
		//Taking input height from user in centimeters
		System.out.println("Enter height in centimeters");
		double height = input.nextDouble();
		
		//calculating height in inches
		double inches = height*2.54;
		
		// Calculating the height in feet
		double heightInFeet = height*30.48;
		
		//Displaying the result
		System.out.println("Your Height in cm is " + height + " while in feet is " + heightInFeet + " and inches is " + inches);
		
		//Closing Scanner class
		input.close();
	}
}
