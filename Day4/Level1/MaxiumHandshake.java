import java.util.Scanner;

class MaximumHandshake {
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
        
		//input for number of students
		System.out.println("Enter the number of students");
		int students = input.nextInt();
       
        // Closing the scanner resource
        input.close();
    }

    // Method to calculate handshakes
    public  static int handShakes(int student) {
        return (student*(student-1))/2;
    }
}
