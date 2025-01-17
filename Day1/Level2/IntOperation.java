import java.util.Scanner;
class IntOperation{
    public static void main(String[] args) {
		//Creating object of scanner class 
        Scanner input = new Scanner(System.in);
		
		//Taking a from user
        System.out.print("Enter a ");
        int a = input.nextInt();
		
		//Taking b from user
        System.out.print("Enter b");
        int b = input.nextInt();
		
		//Taking c from user
        System.out.print("Enter c");
        int c = input.nextInt();
		
		//Operation 1
		int operation1 = a+b*c;
		
		//Operation 2
		int operation2 = a*b+c;
		
		//Operation 3
		int operation3 = c+a/b;
		
		//Operation 4
		int operation4 = a%b+c;
		
		//displaying the result
        System.out.println("The results of Int Operations are " + operation1 + "," + operation2 + "," + operation3 + " and " + operation4);
		
		//closing the scanner class
        input.close();
    }
}
