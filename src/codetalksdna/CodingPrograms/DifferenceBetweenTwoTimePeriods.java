package codetalksdna.CodingPrograms;

import java.time.LocalTime;
import java.time.Duration;

public class DifferenceBetweenTwoTimePeriods {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(9, 30, 0);
        LocalTime time2 = LocalTime.of(10, 15, 30);

        Duration duration = Duration.between(time1, time2);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        System.out.println("Time Difference: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
    }
}
