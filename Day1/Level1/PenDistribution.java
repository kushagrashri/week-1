class PenDistribution{
	public static void main(String[]args){
		//enetring no of pens and students
		int pens = 14 , students =3;

		//calculating no of pen distributed to each student and remaining pen that has nobody 
		int equalDistribution = (pens/students) , nonDistributedPens = (pens%students);

		//displaying result
		System.out.println("The Pen per student is " + equalDistribution + " and the remaining pen not distributed is " + nonDistributedPens);
	}
	
}