import java.util.Scanner;

class Rounds{
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
        
		//input for side of triangle
		System.out.println("Enter side 1 in meters ");
		int side1 = input.nextInt();
		
		System.out.println("Enter side 2 in meters ");
		int side2 = input.nextInt();
		
		System.out.println("Enter side 3 in meters ");
		int side3 = input.nextInt();
		
		
		//creating object for display
		Rounds round= new Rounds();
		
		System.out.println("The number of rounds user has to take is "  + round.rounds(side1,side2,side3));
        // Closing the scanner resource
        input.close();
    }

    // Method to calculate rounds
    public  int rounds(int side2,int side1,int side3) {
        int perimeter = side1+side2+side3;
		 int distance = 5000; // 5km is equals to 5000 meters
		return  distance/perimeter;
    }
}
