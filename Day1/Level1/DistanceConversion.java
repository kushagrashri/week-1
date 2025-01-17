class DistanceConversion{
	public static void main(String[]args){
		//Given distance in kilometers
		double distanceInKilometers = 10.8;
		
		//Caculating the distance in miles
		double distanceInMiles = distanceInKilometers * 1.6;
		
		//Displaying result
		System.out.println("The distance " + distanceInKilometers + " km in miles is " + distanceInMiles);
	}
}