import java.util.Scanner;

class TallestandYoungest{
    public static void main(String[] args) {
        // Creating Scanner class object to take input
        Scanner input = new Scanner(System.in);
		int [] age = new int[3];
		int [] height = new int [3];
		
// taking user input for age and then height
        for(int i =0;i<3;i++){
			System.out.println("Enter ages being " + (i+1));
			age[i] = input.nextInt();
			if(age[i]<0){
				System.out.println("Invalid age please enter again");
			}
		}
		for(int i =0;i<3;i++){
			System.out.println("Enter height for " + (i+1));
			height[i] = input.nextInt();
			if(height[i]<0){
				System.out.println("Invalid height please enter again");
			}
		}
		int tallest =height[0];
		int youngest =age[0]; // to take input
		//to find youngest person among 3
        for(int i =1;i<age.length;i++){
			if(age[i]<youngest){
				youngest = age[i];
			}
		}
		//to find tallest among three
		for(int i =1;i<height.length;i++){
			if(height[i]>tallest){
				tallest = height[i];
			}
		}
		
		System.out.println("The tallest among three is " + tallest +"\n The youngest is " + youngest);
		 // closing scanner class
        input.close();
		}		
    }
