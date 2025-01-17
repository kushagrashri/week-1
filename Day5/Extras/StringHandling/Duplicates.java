import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        // Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text to check for palindrome: ");
        String text = input.nextLine();
        
        // Remove spaces and convert to lowercase
        text = text.toLowerCase();
        text = text.trim();
        
		String result = duplicates(text);
		System.out.println("The original string is "+ text);
		System.out.println("The string after removing duplicates is " + result);
		
       
    }

    // Method to remove duplicates
    public static String duplicates(String text) {
        String transformed = " ";//empty string for storing and comparison
		//iterating through characters of string
		for(int i =0;i<text.length();i++){
			char currentChar = text.charAt(i);
			
			//using indexof method to compare the empty string and original string
			if(transformed.indexOf(currentChar) == -1){
				transformed+=currentChar;
			}
		}
		return transformed;
    }
}
