import java.util.Scanner;
class StringIndexOutOfBoundsExceptionDemo{
public static void main(String[]args){
	//taking input from scanner class 
	Scanner input = new Scanner(System.in);
	//taking input from user
	System.out.println("Enter word");
	String word = input.next();
	handleException(word);
	
}	
//method to create exception
public static void createException(String word){
		System.out.println(word.charAt(word.length() + 1));//this will genreate exception // do not use loop
	
}
public static void handleException(String word){
	try{
		//System.out.println(word.charAt(word.length() + 1));
		createException(word);
	}
	catch(StringIndexOutOfBoundsException e){
		//handle and catch exception
		System.out.println("StringIndexOutOfBoundsException catched " );
	}
}
}