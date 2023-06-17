package codetalksdna.CodingPrograms;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class BirthdayWishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Date of Birth: ");
        int birthDate = sc.nextInt();
        System.out.println("Enter the Month of Birth: ");
        int birthMonth = sc.nextInt();

        LocalDate currentDate = LocalDate.now();
        System.out.println("Todays Date: " + currentDate);

        int date = currentDate.getDayOfMonth();
        Month month = currentDate.getMonth();
        int months = month.getValue();

        if (date == birthDate && months == birthMonth) {
            System.out.println("HAPPY BIRTHDAY TO YOU !!");
        } else {
            System.out.println("Today is not my birthday.");
        }
    }
}
