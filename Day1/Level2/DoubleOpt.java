import java.util.Scanner;
class DoubleOpt{
    public static void main(String[] args) {
		//Creating object of scanner class 
        Scanner input = new Scanner(System.in);
		
		//Taking a from user
        System.out.print("Enter a ");
        double a = input.nextDouble();
		
		//Taking b from user
        System.out.print("Enter b");
        double b = input.nextDouble();
		
		//Taking c from user
        System.out.print("Enter c");
        double c = input.nextDouble();
		
		//Operation 1
		double operation1 = a+b*c;
		
		//Operation 2
		double operation2 = a*b+c;
		
		//Operation 3
		double operation3 = c+a/b;
		
		//Operation 4
		double operation4 = a%b+c;
		
		//displaying the result
        System.out.println("The results of Int Operations are " + operation1 + "," + operation2 + "," + operation3 + " and " + operation4);
		
		//closing the scanner class
        input.close();
    }
}
