import java.util.Scanner;
class VowelsAndConsonants{
	public static void main(String[]args){
		//taking input from class by creating sacanner class object
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		int count[]=findVowelsandConsonants(text);
		 System.out.println("The number of vowels and consonants in the text \"" + text + "\" are:");
        System.out.println("Vowels: " + count[0]);
        System.out.println("Consonants: " + count[1]);
		
	}
	
	// method to find number of vowels and consonants
	public static int []findVowelsandConsonants(String text){
		int []findVowelsandConsonants= new int[text.length()];
		int countVowel =0;
		int countConsonant =0;
		for(int i =0;i<text.length();i++){
			char ch =Character.toLowerCase(text.charAt(i));
			if(ch >= 'a'&&ch<='z'){
				if(ch =='a'||ch =='i'||ch=='o'||ch =='u'||ch=='e'){
				countVowel++;
				}
			
			else{
				countConsonant++;
			}
		}
		}
		System.out.println("The number of vowels are " + countVowel + " and number of consonants are : " + countConsonant);
		
		return  new int[]{countVowel,countConsonant};
	}
	
}