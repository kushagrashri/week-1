import java.util.Scanner;
class SubstringIndex{
	public static void main(String[]args){
		//creating scanner class object for input
		Scanner input = new Scanner(System.in);
		//entering  string
		System.out.println("Enter word");
		String word = input.next();
		
		//entering first index of string
		System.out.println("Enter first index of the  word");
		int start = input.nextInt();
		
		//entering second index of string
		System.out.println("Enter second index of the  word");
		int end = input.nextInt();
		
		String substringCharAt = substrings(word,start,end);
		String builtInSubstring = word.substring(start,end);
		boolean answer = comparison(substringCharAt,builtInSubstring);
		
		System.out.println("Custom substring (using charAt): " + substringCharAt);
        System.out.println("Built-in substring: " + builtInSubstring);
        System.out.println("Are the two substrings equal? " + (answer ? "Yes" : "No"));
		} 
	
	// function to create substrings from start and end index
	public static String substrings(String word,int start,int end){
		String result = "";//empty string to store results
		for(int i =start;i<end;i++){
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