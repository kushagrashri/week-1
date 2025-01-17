class AveragePercentMarks{
	public static void main(String[]args){
		//Name of person
		String name = "Sam";
		
		//Marks scored in different subjects i.e. Physics Chemistry and maths.
		int physicsMarks = 95 , mathsMarks = 94 , chemistryMarks =96;
		
		//Total marks of all subjects
		int totalMarks = 300;
		
		//Calculating average marks of sam in all subjects.
		double averageMarks = ((double)(physicsMarks+mathsMarks+chemistryMarks)/totalMarks);
		
		//Calculating average percentage of the average marks
		double percentage = averageMarks*100;
		
		//Displaying result 
		System.out.println("Sam's average marks in PCM is ");
		
	}
}