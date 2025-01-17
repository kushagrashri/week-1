public class AutoMorphicNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;  // Prime numbers are greater than 1
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // If divisible by any number other than 1 and itself
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static void main(String[] args) {
        int number = 28; // Example number for testing

        // Check if the number is prime
        System.out.println("Is " + number + " a Prime Number? " + isPrime(number));

        // Check if the number is a Neon number
        System.out.println("Is " + number + " a Neon Number? " + isNeon(number));

        // Check if the number is a Spy number
        System.out.println("Is " + number + " a Spy Number? " + isSpy(number));

        // Check if the number is an Automorphic number
        System.out.println("Is " + number + " an Automorphic Number? " + isAutomorphic(number));

        // Check if the number is a Buzz number
        System.out.println("Is " + number + " a Buzz Number? " + isBuzz(number));
    }
}
