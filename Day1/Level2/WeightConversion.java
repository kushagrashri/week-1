import java.util.Scanner;
class WeightConversion{
    public static void main(String[] args) {
		//creating scanner class objects for taking input
        Scanner input = new Scanner(System.in);
		
		//enter weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();
		
		//converting it in kilograms
        double weightInKilograms = weightInPounds / 2.2;
		
		//displaying result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKilograms + ".");
		
		// closing scanner class
		input.close();
    
	}
}
