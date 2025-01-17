import java.util.Scanner;

class SumOfNaturalNumbers{
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
       //taking input of number
	   System.out.println("Enter a number :");
	   int number = input.nextInt();
	   
	   // creating object to access non static method
	   SumOfNaturalNumbers natural = new SumOfNaturalNumbers();
	   
	   System.out.println("The sum of " + number + " natural numbers is :  " + natural.Sum(number));
	   //closing scanner class
	           input.close();

		}
    

    // Method to find sum of n natural number
    public int Sum(int number) {
		
        return (number*(number+1))/2;
    }
	

}