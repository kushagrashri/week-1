import java.util.Scanner;

class QuotientAndRemainder{
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
       //taking input of number
	   System.out.println("Enter a number of total chocolates :");
	   int number = input.nextInt();
	   
	   System.out.println("Enter a number of total students :");
	   int divisor = input.nextInt();
	   
	   int [] result = findRemainderAndQuotient(number,divisor); // adding method content directly to array
	   System.out.println("The Quotient of Numbers is " + result[0] );
	   System.out.println("The Remainder of numbers is " + result[1]);
	           input.close();

		}
    

    // Method to find sum of quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
		int quotient = number/divisor;
		int remainder = number%divisor;
		return new int[] {quotient,remainder};//returning in form of created array
    }
	

}