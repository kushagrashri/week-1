import java.util.Scanner;

class MaximumHandshakeDisplay {
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
        
		//input for number of students
		System.out.println("Enter the number of students");
		int students = input.nextInt();

		//creating object for display
		MaximumHandshakeDisplay handshake = new MaximumHandshakeDisplay();
		
		System.out.println("The maximum handshakes among " + students + " is " + handshake.handShakes(students));
        // Closing the scanner resource
        input.close();
    }

    // Method to calculate handshakes
    public  int handShakes(int students) {
        return (students*(students-1))/2;
    }
}
