import java.util.Scanner;
class Uppercase{
	public static void main(String[]args){
		//creating scanner class object for input
		Scanner input = new Scanner(System.in);
		//entering  string
		System.out.println("Enter sentence");
		String sentence = input.nextLine();
		
		
		String Lowercase = lowerCase(sentence);
		String builtinUppercase = sentence.toLowerCase();
		boolean answer = comparison(Lowercase,builtinUppercase);
		
		System.out.println("Custom lowerCase (using charAt): " + Lowercase);
        System.out.println("Built-in upercase sentence is: " + builtinUppercase);
        System.out.println("Are the two sentences equal? " + (answer ? "Yes" : "No"));
		} 
	
	// function to create method to convert all upperCase to lowercase
	public static String lowerCase(String sentence){
		String result = "";//empty string to store result
		for(int i =0;i<sentence.length();i++){
			char ch = sentence.charAt(i);
			if(ch>='A' && ch<='Z'){//check if lowercase
			ch = (char)(ch+32);	//subtracting values to convert itto capital
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