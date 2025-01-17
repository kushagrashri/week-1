import java.util.Scanner;
class DiscountedFeesViaInput{
	public static void main(String [] args){
		//importing scanner class and creating object
		Scanner input = new Scanner(System.in);
		
		//Taking input fees and input discount from user
		System.out.println("Enter fees ");
		int fees = input.nextInt();
		
		//Taking discount amount to be applied by user
		System.out.println("Enter amount to be discounted");
		int discountPercent = input.nextInt();
		
		// Calculating the discount by formula
		double discount = ((double)fees *discountPercent/100);
		
		//fianl fees after discount
		double finalFees = fees - discount;
		
		//Displaying the result
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFees);
		
		//Closing Scanner class
		input.close();
	}
}
