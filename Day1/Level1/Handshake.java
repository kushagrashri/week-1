import java.util.Scanner;
class Handshake{
    public static void main(String[] args) {
		//creating object of scanner class
        Scanner input = new Scanner(System.in);
		
		//taking input of no of students
        System.out.print("Enter the number of students");
        int numberOfStudents = input.nextInt();
		
		//calculating number of handshakes
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		
		//displaying result
        System.out.println("The maximum number of possible handshakes is " + maximumHandshakes);
		
		//closing scanner class
        input.close();
    }
}
