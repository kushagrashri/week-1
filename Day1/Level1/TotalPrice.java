import java.util.Scanner;
class TotalPrice{
    public static void main(String[] args) {
		//Creating object of scanner class 
        Scanner input = new Scanner(System.in);
		
		//unit price of item
        System.out.print("Enter the unit price of item ");
        int itemPrice = input.nextInt();
		
		//total items to be bought
        System.out.print("Enter the amount of items to be bought");
        int itemQuantity = input.nextInt();
		
		//total price
		int totalPrice = itemPrice*itemQuantity;
		
		//displaying the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + itemQuantity + " and unit price is INR " + itemPrice);
		
		//closing the scanner class
        input.close();
    }
}
