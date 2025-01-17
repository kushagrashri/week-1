import java.util.Scanner;
class SwappingNumbers{
    public static void main(String[] args) {
		//creating object of scanner class
        Scanner input = new Scanner(System.in);
		
		//Entering number1
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
		
		//entering number2
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
		
		//Creating temprorary valriable and assigning it value for swapping
        int temp = number1;
        number1 = number2;
        number2 = temp;
		
		//Displaying result
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
		
		//Closing scanner class
        input.close();
    }
}
