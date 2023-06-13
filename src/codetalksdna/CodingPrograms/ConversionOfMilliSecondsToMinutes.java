package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class ConversionOfMilliSecondsToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time in MilliSeconds");
        float milliSeconds = scanner.nextInt();

        float seconds = milliSeconds / 1000;
        System.out.println("The time in seconds is" + " " + seconds);

        float minutes = seconds / 60;
        System.out.println("The time in minutes is" + " " + minutes);

        float hours = minutes / 60;
        System.out.println("The time in Hours is" + " " + hours);
    }
}
