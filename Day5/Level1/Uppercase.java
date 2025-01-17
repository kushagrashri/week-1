import java.util.Scanner;
class Uppercase{
	public static void main(String[]args){
		//creating scanner class object for input
		Scanner input = new Scanner(System.in);
		//entering  string
		System.out.println("Enter sentence");
		String sentence = input.nextLine();
		
		
		String Uppercase = upperCase(sentence);
		String builtinUppercase = sentence.toUpperCase();
		boolean answer = comparison(Uppercase,builtinUppercase);
		
		System.out.println("Custom uppercase (using charAt): " + Uppercase);
        System.out.println("Built-in lowercase sentence is: " + builtinUppercase);
        System.out.println("Are the two sentences equal? " + (answer ? "Yes" : "No"));
		} 
	
	// function to create method to convert all lowercase to uppercase
	public static String upperCase(String sentence){
		String result = "";//empty string to store result
		for(int i =0;i<sentence.length();i++){
			char ch = sentence.charAt(i);
			if(ch>='a' && ch<='z'){//check if lowercase
			ch = (char)(ch-32);	//subtracting values to convert itto capital
			}
			result+=ch;
		}
		return result;
	}
	//function to compare two strings by boolean function
	public static boolean comparison(String str1,String str2 ){
		//comparing length first
		if(str1.length()!=str2.length()){
			return false;
		}
		for(int i =0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
}