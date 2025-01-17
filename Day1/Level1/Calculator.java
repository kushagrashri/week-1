import java.util.Scanner;
public class Calculator{
    public static void main(String[]args){
		//creating object of scanner class
        Scanner input = new Scanner(System.in);
		
		//Taking input of two numbers from user
		System.out.println("Enter number 1");
        float number1 = input.nextFloat(); 
		System.out.println("Enter number 2");
        float number2 = input.nextFloat();
        
		//adition of two numbers
		float add = number1+number2;
		
		//Subtraction of two numbers
        float subtract = number1-number2;
		
		//Multiplication of two numbers
        float multiply = number1*number2;

		//Division of two numbers
        float division = number1/number2;
        
		//displaying the result
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + ","+ subtract + "," + multiply + "and " + division);
		
		//closing scanner class
		input.close();
    }
}
