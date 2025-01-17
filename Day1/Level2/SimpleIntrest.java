import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args) {
		//creating object of scanner class for taking inputs
        Scanner input = new Scanner(System.in);
		
		//Enter principal
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();
		
		//enter rate
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();
		
		//enter time in years
        System.out.print("Enter the time period in years: ");
        double time = input.nextDouble();
		
		//calculating simple intrest
        double simpleInterest = (principal * rate * time) / 100;
		
		//displaying result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + ".");
		
		//closing scanner class
		input.close();
    }
}
