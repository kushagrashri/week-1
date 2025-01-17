import java.util.Scanner;
class RemainderAndQuotient{
    public static void main(String[] args) {
		//Creating object of scanner class 
        Scanner input = new Scanner(System.in);
		
		//Taking number1 from user
        System.out.print("Enter number1 ");
        int number1 = input.nextInt();
		
		//Taking number2 from user
        System.out.print("Enter number2");
        int number2 = input.nextInt();
		
		//Finding quotient
		int quotient = number1/number2;
		
		//Finding remainder
		int remainder = number1%number2;
		
		//displaying the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
		
		//closing the scanner class
        input.close();
    }
}
