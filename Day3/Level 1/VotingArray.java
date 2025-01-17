import java.util.Scanner;
class VotingArray{
	public static void main(String[]args){
		//taking input from Scanner class by creating object
		Scanner input = new Scanner(System.in);
		
		//creating array of size 10 and entering age by user
		int []age = new int[10];
		//displaying ages
		for(int i =0;i<10;i++){
			System.out.print("The age of person "+ (i+1) + " is: " );
		age[i] = input.nextInt();
		}
		for(int i=0; i<10; i++){
	
			//Checking if the person can vote or not
		if(age[i] <0){
			System.err.print("Invalid age");
		}
		else if(age[i]<18 && age[i] >0) {
			System.out.println("The student with age " + (age[i]) + " cannot vote.");
		}
		else{
			System.out.println("The student with age " + (age[i]) + " can vote.");
		}
		}
	}
}
