package codetalksdna.CodingPrograms;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class BirthdayWishes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Date of Birth and Moth: ");
        int birthDate = sc.nextInt();
        int birthMonth = sc.nextInt();

        // get current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Todays Date: " + currentDate);

        // get current date and month
        int date = currentDate.getDayOfMonth();
        Month month = currentDate.getMonth();


        /*if(date == birthDate && Month == birthMonth) {
            System.out.println("HAPPY BIRTHDAY TO YOU !!");
        }
        else {
            System.out.println("Today is not my birthday.");
        }*/
    }
}
