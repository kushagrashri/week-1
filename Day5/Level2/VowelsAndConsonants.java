import java.util.Scanner;

class SplitSentence {
    public static void main(String[] args) {
        // Creating scanner class object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter Sentence:");
        String text = input.nextLine();
		int counts [] = convertToLowerCase(text);
		System.out.println("Vowel count: " + counts[0]);
        System.out.println("Consonant count: " + counts[1]);

    }
	// method t0 convert all uppercase to lowercase and count vowels consonants and not a letter
	public static int [] convertToLowerCase(String text){
		int vowelCount =0;
		int consonantCount =0;
		int notALetter =0;
		for(int i =0;i<text.length();i++){
			char ch = text.charAt(i);
			if(ch>= 'A'&& ch<='Z'){// converts uppercase to lowercase
				ch = (char)(ch +32);
			}
			if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
				vowelCount++;
			}
			else if(ch == ' '){
				notALetter++;
			}
			else{
				consonantCount++;
			}
		}
		return new int[]{vowelCount,consonantCount};
	}

}
