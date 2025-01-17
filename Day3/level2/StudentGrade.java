import java.util.Scanner;

public class StudentGrade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Input marks for Physics
            while (true) {
                System.out.print("Physics: ");
                physicsMarks[i] = input.nextInt();
                if (physicsMarks[i] >= 0) break;
                System.out.println("Invalid marks! Please enter positive values.");
            }

            // Input marks for Chemistry
            while (true) {
                System.out.print("Chemistry: ");
                chemistryMarks[i] = input.nextInt();
                if (chemistryMarks[i] >= 0) break;
                System.out.println("Invalid marks! Please enter positive values.");
            }

            // Input marks for Maths
            while (true) {
                System.out.print("Maths: ");
                mathsMarks[i] = input.nextInt();
                if (mathsMarks[i] >= 0) break;
                System.out.println("Invalid marks! Please enter positive values.");
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300.0) * 100;

            // Assign grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 75) {
                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "F";
            }
        }

        // Display results
        System.out.println("\n--- Student Marks, Percentages, and Grades ---");
        System.out.printf("%-10s %-10s %-10s %-15s %-10s %-10s%n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-15.2f %-10s%n",
                    physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }

        input.close();
    }
}
