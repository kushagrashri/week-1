import java.util.Scanner;

class QuotientAndRemainder{
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
       //taking input of number
	   System.out.println("Enter a number 1 :");
	   int number1 = input.nextInt();
	   
	   System.out.println("Enter a number 2 :");
	   int number2 = input.nextInt();
	   
	   int [] result = findRemainderAndQuotient(number1,number2); // adding method content directly to array
	   System.out.println("The Quotient of Numbers is " + result[0] );
	   System.out.println("The Remainder of numbers is " + result[1]);
	           input.close();

		}
    

    // Method to find sum of quotient and remainder
    public static int[] findRemainderAndQuotient(int number1, int number2) {
		int quotient = number1/number2;
		int remainder = number1%number2;
		return new int[] {quotient,remainder};//returning in form of created array
    }
	

}