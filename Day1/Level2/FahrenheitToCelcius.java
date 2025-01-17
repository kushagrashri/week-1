import java.util.*;
public class FahrenheitToCelcius{
	public static void main(String[]args){
		//Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		//entering temperature in fahrenheit by user
		System.out.println("Enter Temperature");
		int fahrenheit = sc.nextInt();
		
		//Converting fahrenheit temperature into celcius
		int celciusResult = ((fahrenheit-32) *5/9);
		
		//Displaying result
		System.out.println("The " + fahrenheit + " fahrenheit is " + celciusResult + " celcius ");
		sc.close();
	}
}
