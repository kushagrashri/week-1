import java.util.Random;

public class EmployeeBonus {

    // Method to generate random salary and years of service for employees
    public static int[][] determineSalaryAndService(int numEmployees) {
        Random random = new Random();
        int[][] employeeData = new int[numEmployees][2]; // 2D array: [salary, years of service]

        for (int i = 0; i < numEmployees; i++) {
            // Random salary between 10000 and 99999
            employeeData[i][0] = random.nextInt(90000) + 10000;

            // Random years of service between 1 and 15 years
            employeeData[i][1] = random.nextInt(15) + 1;
        }

        return employeeData;
    }

    // Method to calculate the new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] updatedEmployeeData = new double[employeeData.length][3]; // [old salary, new salary, bonus]

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = 0;

            // If years of service > 5, give a 5% bonus, else 2% bonus
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }

            // New salary after adding bonus
            double newSalary = oldSalary + bonus;

            updatedEmployeeData[i][0] = oldSalary;
            updatedEmployeeData[i][1] = newSalary;
            updatedEmployeeData[i][2] = bonus;
        }

        return updatedEmployeeData;
    }

    // Method to calculate and display the total old salary, new salary, and bonus amount in a tabular format
    public static void displaySalarySummary(int[][] employeeData, double[][] updatedEmployeeData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Print header
        System.out.println("Employee\tOld Salary\tNew Salary\tBonus");
        System.out.println("------------------------------------------------");

        // Print employee data and calculate totals
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = updatedEmployeeData[i][0];
            double newSalary = updatedEmployeeData[i][1];
            double bonus = updatedEmployeeData[i][2];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i + 1, oldSalary, newSalary, bonus);
        }

        // Display totals
        System.out.println("------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate random salary and years of service for 10 employees
        int[][] employeeData = determineSalaryAndService(numEmployees);

        // Calculate the new salary and bonus
        double[][] updatedEmployeeData = calculateNewSalaryAndBonus(employeeData);

        // Display the salary summary in tabular format
        displaySalarySummary(employeeData, updatedEmployeeData);
    }
}
