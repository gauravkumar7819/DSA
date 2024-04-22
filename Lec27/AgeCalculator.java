package Lec27;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (dd-mm-yy): ");
        String birthdateStr = scanner.nextLine();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
            LocalDate birthdate = LocalDate.parse(birthdateStr, formatter);
            LocalDate currentDate = LocalDate.now();
            Period age = Period.between(birthdate, currentDate);

            System.out.printf("Your age is %d years, %d months, and %d days.%n",
                    age.getYears(), age.getMonths(), age.getDays());
        } catch (Exception e) {
            System.out.println("Please enter a valid date in dd-mm-yy format.");
        }
    }
}