import java.util.Scanner;
class SubstringIndex{
	public static void main(String[]args){
		//creating scanner class object for input
		Scanner input = new Scanner(System.in);
		//entering  string
		System.out.println("Enter word");
		String word = input.next();
		
		String substringCharAt = substrings(word);
		String builtInSubstring = new String(word.toCharArray());// this needs to be done because string cannot be converted to charaacter 
		boolean answer = comparison(substringCharAt,builtInSubstring);
		
		System.out.println("Custom substring (using charAt): " + substringCharAt);
        System.out.println("Built-in substring: " + builtInSubstring);
        System.out.println("Are the two substrings equal? " + (answer ? "Yes" : "No"));
		} 
	
	// function to return all characters of string using charAt
	public static String substrings(String word){
		String result = "";//empty string to store results
		for(int i =0;i<word.length();i++){
			result+=word.charAt(i);
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