class ProfitLossCalculation{
	public static void main(String[]args){

		//costprice and selling price 
		int costPrice = 129 , sellingPrice = 191;

		//profit calculation
		int profit = sellingPrice-costPrice;

		//profit percentage calculation
		double profitPercentage = ((double)profit/costPrice)*100;

		//displaying result
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is " + sellingPrice +
		"\n The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}