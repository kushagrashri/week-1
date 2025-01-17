import java.util.Scanner;

class WindChill{
    public static void main(String[] args) {
        // Creating scanner class object for input
        Scanner input = new Scanner(System.in);
       //taking input of temperature
	   System.out.println("Enter a temperature :");
	   int temperature = input.nextInt();
	   
	   System.out.println("Enter Windspeed :");
	   int windSpeed = input.nextInt();
	   
	   System.out.println("The windchill according to temperature is " +  WindChill(temperature,windSpeed));
	           input.close();

		}
    

    // Method to find windchill with formula and math class
    public static double WindChill(double temperature, double windSpeed) {
		double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
		return windChill;
    }
	

}