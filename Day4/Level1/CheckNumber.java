import java.util.Scanner;

class CheckNumber{
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
        
		System.out.println("Enter Number : ");
		int number = input.nextInt();
		
		// creacting object 
		CheckNumber numbers = new CheckNumber();
         
System.out.println( numbers.typeNumber(number));		 
        // Closing the scanner resource
        input.close();
    }

    // Method to calculate type of number
    public  int typeNumber(int number) {
        if (number<0){
			 return -1;
		}
		else if (number ==0){
			return 0;
		}
		else{
			return 1;
		}
    }
}
