import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		int count =0;
		
		//array for storing digits
		int[]digits = new int [number];
		
		//find count of disgits
		while(number!=0){
			digits[count]=number%10;//modulo for remainder digit
			number/=10;//working on number
			count++;
		}
		int []reverse = new int[count];
		for(int i =0;i<count;i++){
			reverse[i] = digits[i];
		}
		for(int i =0;i<reverse.length;i++){
		System.out.println("The reverse order of digits is " + reverse[i]);
		}
        input.close();
    }
}
