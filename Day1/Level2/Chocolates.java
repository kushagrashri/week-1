import java.util.Scanner;
class ChocolateDivision {
    public static void main(String[] args) {
		//creating scanner class object
        Scanner input = new Scanner(System.in);
		
		//enter number of chocolates
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();
		
		//enter number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
		
		//calculating chocolates for each
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
		
		//remainingchocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;
		
		//displaying result
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +" and the number of remaining chocolates are " + remainingChocolates + ".");
		
		//closing scanner class
		input.close();
    }
}
