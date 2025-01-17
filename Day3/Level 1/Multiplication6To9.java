import java.util.Scanner;

class PlayingWithNumbers {
    public static void main(String[] args) {
        // Creating Scanner class object for taking input
        Scanner input = new Scanner(System.in);
		System.out.println("Enter input number");
		int number = input.nextInt();
		
		//declaring array to store result
		int result[] = new int[10];
		for(int i =6;i<result.length;i++){
		System.out.println(number + " * " + i + " = " + (number*i));	
		}
        // Close the scanner
        input.close();
    }
}
