public class BMI {
    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100;
        return weight / (heightMeters * heightMeters);
    }

    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        double[][] persons = {
                {70, 175}, {80, 165}, {90, 180}, // Example data
        };

        for (double[] person : persons) {
            double bmi = calculateBMI(person[0], person[1]);
            String status = determineBMIStatus(bmi);
            System.out.println("Weight: " + person[0] + "kg, Height: " + person[1] + "cm, BMI: " + bmi + ", Status: " + status);
        }
    }
}
