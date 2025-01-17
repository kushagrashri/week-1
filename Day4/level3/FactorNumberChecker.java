public class FactorNumberChecker {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            if (factor != number) {  // Exclude the number itself
                sum += factor;
            }
        }
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            if (factor != number) {  // Exclude the number itself
                sum += factor;
            }
        }
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            if (factor != number) {  // Exclude the number itself
                sum += factor;
            }
        }
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }

    // Method to calculate factorial of a number
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 28; // Example number for testing
        int[] factors = findFactors(number);

        // Display results of the different methods
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor of " + number + ": " + greatestFactor(factors));
        System.out.println("Sum of Factors of " + number + ": " + sumOfFactors(factors));
        System.out.println("Product of Factors of " + number + ": " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors of " + number + ": " + productOfCubesOfFactors(factors));

        System.out.println("Is " + number + " a Perfect Number? " + isPerfectNumber(number));
        System.out.println("Is " + number + " an Abundant Number? " + isAbundantNumber(number));
        System.out.println("Is " + number + " a Deficient Number? " + isDeficientNumber(number));
        System.out.println("Is " + number + " a Strong Number? " + isStrongNumber(number));
    }
}
