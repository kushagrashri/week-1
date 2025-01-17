import java.util.Scanner;
class StringReverse{
	public static void main(String[]args){
		//taking input from class by creating sacanner class object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text to be reversed : ");
		String text = input.nextLine();
		
		System.out.println("The original word is : " + text);
		
		String reversedText = reverseString(text); // Call the reverseString method
        System.out.println("The reversed word is: " + reversedText);

		
	}
	
	// method to find number of vowels and consonants
	public static String reverseString(String text){
		char [] originalString = text.toCharArray();// cretaing array whose size is same as length of input text
		char  [] newString = new char [originalString.length];
		
		 for (int i = 0, j = originalString.length - 1; i < originalString.length; i++, j--) {
            newString[j] = originalString[i];
        }
				return new String (newString);
	}
	}
	
