import java.util.Random;

public class StudentScores {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths for each student
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 2D array: [Physics, Chemistry, Maths]

        for (int i = 0; i < numStudents; i++) {
            // Random scores between 0 and 99 (2-digit numbers)
            scores[i][0] = random.nextInt(100); // Physics score
            scores[i][1] = random.nextInt(100); // Chemistry score
            scores[i][2] = random.nextInt(100); // Maths score
        }

        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // [Total, Average, Percentage, Student Index]

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Total score
            double average = total / 3.0; // Average score
            double percentage = (total / 300.0) * 100; // Percentage calculation

            // Storing total, average, and percentage
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounding to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounding to 2 decimal places
        }

        return results;
    }

    // Method to display the scorecard of all students in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%.2f\t%.2f\t%.2f%%\n", 
                i + 1, 
                scores[i][0], 
                scores[i][1], 
                scores[i][2], 
                results[i][0], 
                results[i][1], 
                results[i][2]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students

        // Generate random scores for students
        int[][] scores = generateScores(numStudents);

        // Calculate the total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Display the scorecard in tabular format
        displayScorecard(scores, results);
    }
}
