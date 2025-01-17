import java.util.Scanner;

public class MarksAndGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create a 2D array for marks and 1D arrays for percentages and grades
        int[][] marks = new int[numStudents][3]; // [Physics, Chemistry, Maths]
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                while (true) {
                    System.out.print(subject + ": ");
                    marks[i][j] = input.nextInt();
                    if (marks[i][j] >= 0) break; // Accept only positive values
                    System.out.println("Invalid marks! Please enter a positive value.");
                }
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100; // Percentage calculation

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
        System.out.println("\n--- Marks, Percentages, and Grades ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s %-10s%n", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");

        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10d %-10d %-10d %-15.2f %-10s%n",
                    marks[i][0], marks[i][1], marks[i][2], totalMarks, percentages[i], grades[i]);
        }

        input.close();
    }
}
