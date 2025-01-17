import java.util.Scanner;
class ArrayIndexOutOfBoundsExceptionDemo{
public static void main(String[]args){
	//taking input from scanner class 
	Scanner input = new Scanner(System.in);
	//taking input from user
	System.out.println("Enter word");
	String word = input.next();
	String[] array = new String[word.length()];//creating array and inputing user value
	for(int i=0;i<array.length;i++){
		System.out.println("enter name");
		array[i] = input.nextLine();
	}

	handleException(word,array);//handling both run time and compile time exception
	
}	
//method to create exception
public static void createException(String word , String[] array){
	System.out.println(array[array.length]); // This will generate exception
;//this will genreate exception // do not use loop
	
}
public static void handleException(String word, String []array){
	try{
		//System.out.println(word.charAt(word.length() + 1));
		createException(word , array);
	}
	catch(ArrayIndexOutOfBoundsException e){
		//handle and catch exception
		System.out.println("ArrayIndexOutOfBoundsException catched " );
	}
	catch(RuntimeException e){
		System.out.println("Caught runtime exception" + e.getMessage());//for illegalargument exception we need to catch exception at both run time and compile
	}
}
}