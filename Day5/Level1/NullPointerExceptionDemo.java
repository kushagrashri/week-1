import java.util.Scanner;
class NullPointerExceptionDemo{
public static void main(String[]args){
	//taking input from scanner class 
	Scanner input = new Scanner(System.in);
	handleException();
	
}	
//method to create exception
public static void createException(){
	String word = null;//this will generate null pointer exception
	System.out.println(word.length());
	
}
public static void handleException(){
	try{
	String word = null;//this will generate null pointer exception
	System.out.println(word.length());
	}
	catch(NullPointerException e){
		//handle and catch exception
		System.out.println("Null Pointer Ecxeption catched " );
	}
}
}