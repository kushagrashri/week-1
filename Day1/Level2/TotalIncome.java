import java.util.Scanner;
class TotalIncome{
    public static void main(String[] args) {
		// Creating object of scanner class
        Scanner input = new Scanner(System.in);
		
		//Taking input of salary
        System.out.print("Enter the salary: ");
        double salary = input.nextDouble();
		
		//Taking input of bonus
        System.out.print("Enter the bonus: ");
        double bonus = input.nextDouble();
		
		//Calculating total income of user
        double totalIncome = salary + bonus;
		
		//Displaying result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
		
		//Closing Scanner class
        input.close();
    }
}
