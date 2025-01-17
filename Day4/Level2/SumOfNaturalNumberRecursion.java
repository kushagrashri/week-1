import java.util.Scanner;

class SumOfNaturalNumberRecursion{
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
       //taking input of number
	   System.out.println("Enter a number :");
	   int number = input.nextInt();
	   
	   System.out.println("The sum of " + number + " natural numbers using formula :  " +Sum(number));
	   
	   System.out.println("The sum of " + number + " natural numbers using recursion :  " + recursion(number));
	   
	   System.out.println("The sum of " + number + " natural numbers using both are equal:  " +Sum(number)==recursion(number));
	   //closing scanner class
	           input.close();

		}
    

    // Method to find sum of n natural number
    public static int Sum(int number) {
		
        return (number*(number+1))/2;
    }
	//method to find sum using recursion
	public static int recursion(int number){
		if(number<1){
			return number;
		}
		return n + recursion(n-1);
	}

}