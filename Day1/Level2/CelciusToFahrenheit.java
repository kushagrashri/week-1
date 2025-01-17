import java.util.*;
public class CelciusToFahrenheit{
	public static void main(String[]args){
		//Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		//entering temperature in celcius by user
		System.out.println("Enter Temperature");
		int celcius = sc.nextInt();
		
		//Converting celcius temperature into fahrenheit
		int fahrenhietResult = ((celcius * 9/5) + 32);
		
		//Displaying result
		System.out.println("The " + celcius + " celsius is " + fahrenhietResult + "fahrenheit");
		sc.close();
	}
}
