import java.util.Scanner;

class MaxWordCount {
    public static void main(String[] args) {
        // Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String text = input.nextLine();
        
        // Remove spaces and convert to lowercase
        text = text.toLowerCase();
		
		String longestWord = (maximumCount(text));//using a variable to store result returned by method
        System.out.println("The longest word in sentence is : " + longestWord);
    }

    // Method to count maximum words in a sentence
	
    public static String maximumCount(String text) {
		String [] words = text.split(" ");//always be called with a delimitter like space to separate
		String longestWord = "" ;//empty variable for storing longest word
		for(String word : words){ // in array of words we start by every word and compare
			if(word.length()>longestWord.length()){//direct comparing lengths for simplification
				longestWord = word;
			}
		}
return longestWord;		
}
}