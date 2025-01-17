class DiscountedFees{
	public static void main(String [] args){
		//declaring fees and discount percent
		int fees = 125000 , discountPercent = 10;
		
		//calculating discounted amount to be deducted
		double discount = ((double)fees *discountPercent/100);
		
		//total fees after reduction
		double finalFees = fees - discount;
		
		//Displaying the result
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFees);
	}
}