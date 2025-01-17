import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        // Creating Scanner class object to take input
        Scanner input = new Scanner(System.in);

        double salary[] = new double[10];
        double yearsOfService[] = new double[10];
        double newSalary[] = new double[10];
        double bonus[] = new double[10];

        double totalBonus = 0.0;
        double totalNewSalary = 0.0;
        double totalOldSalary = 0.0;

        // Input salary and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            while (true) {
                System.out.print("Enter salary: ");
                salary[i] = input.nextDouble();
                if (salary[i] < 0) {
                    System.out.println("Invalid salary. Please enter again.");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = input.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter again.");
                    continue;
                }
                break;
            }
        }

        // Calculating bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--- Results ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] + ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
