public class NumberAnalysis {
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        return Integer.compare(num1, num2);
    }

    public static void main(String[] args) {
        int[] numbers = {3, -7, 4, 10, 12};

        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is positive and ");
                System.out.println(isEven(number) ? "even." : "odd.");
            } else {
                System.out.println(number + " is negative.");
            }
        }

        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparison > 0) {
            System.out.println("First number is greater.");
        } else if (comparison < 0) {
            System.out.println("Last number is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
