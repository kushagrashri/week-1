import java.util.Scanner;
class HeightOfTriangle{
	public static void main(String [] args){
		//importing scanner class and creating object
		Scanner input = new Scanner(System.in);
		
		//Taking input height from user
		System.out.println("Enter height");
		double height = input.nextDouble();
		
        //Taking input base from user 
		System.out.println("Enter base");
		double base = input.nextDouble();	
		
		//Calculating area in centimeter square
		double area = 0.5*base*height;
		
		//calculating area of traingle in inches
		double areaInInches = area*2.54;
		
		//Displaying the result
		System.out.println("The area of traingle with height " + height + " and base" + base + " is " +  area + "in square centimeters and " + areaInInches + "in centimeter inches");
		
		//Closing Scanner class
		input.close();
	}
}
