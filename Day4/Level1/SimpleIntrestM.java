import java.util.Scanner;

class SimpleIntrestM {
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
        
        // Asking for user input
        System.out.println("Enter Principal amount: ");
        int principal = input.nextInt();
        
        System.out.println("Enter Rate: ");
        int rate = input.nextInt();
        
        System.out.println("Enter Time period: ");
        int time = input.nextInt();

        // Create object of SimpleIntrestM to call the method
        SimpleIntrestM simpleIntrestCalculator = new SimpleIntrestM();
        
        // Calculate simple interest
        int simpleIntrest = simpleIntrestCalculator.simpleIntrest(principal, rate, time);
        
        // Display the result
        System.out.println("The Simple Interest for the calculated amount is: " + simpleIntrest);
        
        // Closing the scanner resource
        input.close();
    }

    // Method to calculate simple interest
    public int simpleIntrest(int principal, int rate, int time) {
        return (principal * rate * time) / 100;
    }
}
