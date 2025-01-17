import java.util.Scanner;

class SmallestAndLargest{
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
       //taking input of number
	   System.out.println("Enter a number 1 :");
	   int number1 = input.nextInt();
	   
	   System.out.println("Enter a number 2 :");
	   int number2 = input.nextInt();
	   
	   System.out.println("Enter a number 3 :");
	   int number3 = input.nextInt();
	   
	   int [] result = findSmallestAndLargest(number1,number2,number3); // adding method content directly to array
	   System.out.println("The Largest Number is " + result[0] );
	   System.out.println("The smallest number is " + result[1]);
	           input.close();

		}
    

    // Method to find sum of smallest and largest number
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
		int largest = Math.max(number1, Math.max(number2,number3));
		int smallest = Math.min(number1,Math.min(number2,number3));
		return new int[] {largest,smallest};//returning in form of created array
    }
	

}