import java.util.Scanner;
class IllegalArgumentExceptionDemo{
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
		System.out.println(word.substring(4,2));//this will genreate exception // do not use loop
	
}
public static void handleException(String word){
	try{
		//System.out.println(word.charAt(word.length() + 1));
		createException(word);
	}
	catch(IllegalArgumentException e){
		//handle and catch exception
		System.out.println("IllegalArgumentException catched " );
	}
	catch(RuntimeException e){
		System.out.println("Caught runtime exception" + e.getMessage());//for illegalargument exception we need to catch exception at both run time and compile
	}
}
}