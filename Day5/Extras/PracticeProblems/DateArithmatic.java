import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;;
public class DateArithmatic {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //enter date
        System.out.println("Enter  a date in format of (yyyy-mm-dd) :");
        String inputDate = input.nextLine();
        //parse input from string to int
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate date = LocalDate.parse(inputDate,formatter);//object creation

        // calculaton
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1)
        .plusYears(2).minusWeeks(3);

        //display result
        System.out.println("Original date : "+ date.format(formatter));
        System.out.println("Modified date :"+ modifiedDate.format(formatter));
    }
}
