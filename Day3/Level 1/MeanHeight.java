import java.util.Scanner;

class PlayingWithNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create an array to store up to 10 numbers
        double[] heights = new double[11];
		double total = 0.0;
		 for (int i =0;i<heights.length;i++){
			 System.out.println("Enter height for player no : " + (i+1) );
			 heights[i] = input.nextInt();	
            if(heights[i]<0){
			 System.out.println("Height cannot be negative. Please enter a valid value.");
                i--;//enetr again for same player
			}			 
		 }
		 // calculate the sum of height
		 for(int i=0;i<heights.length;i++){
			 total+=heights[i];
		 }
		 
		 // calculating mean of heights
		 double mean = total/heights.length;
		 
		 System.out.println("The mean height of team is " + mean);
		 
		 //closing scanner
		 input.close();
       
    }
}
