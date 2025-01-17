import java.util.Scanner;
class NumberFormatExceptionDemo{
public static void main(String[]args){
	//taking input from scanner class 
	Scanner input = new Scanner(System.in);
	//taking input from user
	System.out.println("Enter word");
	String word = input.next();

	handleException(word);//handling both run time and compile time exception
	
}	
//method to create exception
public static void createException(String word){
	int number =Integer.parseInt(word);
		System.out.println(number);//this will genreate exception // do not use loop
	
}
public static void handleException(String word){
	try{
		//System.out.println(word.charAt(word.length() + 1));
		createException(word);
	}
	catch(NumberFormatException e){
		//handle and catch exception
		System.out.println("NumberFormatException catched " );
	}
	catch(RuntimeException e){
		System.out.println("Caught runtime exception" + e.getMessage());//for illegalargument exception we need to catch exception at both run time and compile
	}
}
}