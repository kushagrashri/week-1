import java.util.Scanner;

class CheckNumber{
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
        //taking input of day and month
		System.out.println("Enter date :");
		int date = input.nextInt();
		System.out.println("Enter month");
		int month = input.nextInt();
		
		//creating object
		CheckNumber season = new CheckNumber();
		if(Spring(date,month)){//to check if our season is spring or not
		System.out.println("Its a Spring Season");}
		else{
			System.out.println("Its not a Spring season");
		}
        input.close();
    }

    // Method to find spring season
    public static boolean Spring(int date, int month) {
        if((month>=3&&date>=20)||(month <=6&& date <=20)||(month>3&&month<6)){
			 return true;
		}
		else{
			 return false;
		}
    }
}
