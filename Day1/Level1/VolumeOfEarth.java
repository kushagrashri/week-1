class VolumeOfEarth{
	public static void main(String[]args){
		// Radius of earth in km
		int radius = 6378; 
		
		//value of pi
		double pi = 3.14;
		// Volume of earth in kilometers
		
		double volumeInKilometers = ((double)4/3 *pi*radis*radis*radis); 
		
		// Volume of earth in miles
		double volumeInMiles = (volumeInKilometers*0.621371 );
		
		//Displaying result
		System.out.println(" The volume of earth in cubic kilometers is " + volumeInKilometers + " and cubic miles is " + volumeInMiles);
	}
}