import java.util.Scanner;
class Equals{
	public static void main(String[]args){
		//creating scanner class object for input
		Scanner input = new Scanner(System.in);
		//entering first string
		System.out.println("Enter first word");
		String word1 = input.next();
		
		//entering second string
		System.out.println("Enter second word");
		String word2 = input.next();

			if(checkStrings(word1,word2)){
				System.out.println("Both strings are Equal");
			}
			else{
				System.out.println("Both strings are not equal");
			}
		} 
	
	// function to check if two strings entered are equal
	public static boolean checkStrings(String word1,String word2){
		//to check if words are equal or not if equal length then proceed
        if(word1.length()!=word2.length()){
			return false;
		}		
		//comparing string if length is equal by charAt method
		
		for(int i =0;i<word1.length();i++){
		if(word1.charAt(i) != word2.charAt(i)){
			return false;
		}
		}
		return true;// indicates string are equal 
	}
}