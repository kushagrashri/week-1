import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define custom date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format the current date in the specified patterns
        String formattedDate1 = currentDate.format(format1);
        String formattedDate2 = currentDate.format(format2);
        String formattedDate3 = currentDate.format(format3);

        // Display the results
        System.out.println("Current Date in format dd/MM/yyyy: " + formattedDate1);
        System.out.println("Current Date in format yyyy-MM-dd: " + formattedDate2);
        System.out.println("Current Date in format EEE, MMM dd, yyyy: " + formattedDate3);
    }
}
