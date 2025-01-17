import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random 6-digit number
        int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
    }

    // Method to validate if all OTPs generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        // If the size of the set equals the size of the array, the OTPs are unique
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otpNumbers = new int[10];
        
        // Generate 10 OTP numbers
        for (int i = 0; i < 10; i++) {
            otpNumbers[i] = generateOTP();
            System.out.println("Generated OTP #" + (i + 1) + ": " + otpNumbers[i]);
        }

        // Check if the OTP numbers are unique
        if (areOTPsUnique(otpNumbers)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}
