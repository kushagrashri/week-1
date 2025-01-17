import java.util.Scanner;
class length{
	public static void main(String[]args){
		//creating scanner class object for taking user input
		Scanner input = new Scanner(System.in);
		//taking user input
		System.out.println("Enter word");
		String word = input.next();
		
		int length = lengthOfString(word);
		int builtInLength = word.length();
		
		System.out.println("Length of the given string is (using method)" + length);
		System.out.println("Length of the given string is (using built in function)" + builtInLength);
		
		
	}
	
	//creating method to calculate length of string
	public static int lengthOfString(String word){
		int count =0;
		while(true){
			try{
			for(int i =0;i<word.length();i++){
				char ch =word.charAt(i);//assigning character index to current
				count++;
			}
				return count;

		}
		catch(RuntimeException e){
			System.out.println("The runtime exception is catched " + e.getMessage());
		}
	}
}
}