import java.util.Random;

public class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; // PCM: Physics, Chemistry, Math

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Physics score (60-100)
            scores[i][1] = random.nextInt(41) + 60; // Chemistry score (60-100)
            scores[i][2] = random.nextInt(41) + 60; // Math score (60-100)
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3]; // Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0; // Rounded to 2 decimal places
            stats[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded to 2 decimal places
        }

        return stats;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];

        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\t\t%s%n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], stats[i][2], grades
