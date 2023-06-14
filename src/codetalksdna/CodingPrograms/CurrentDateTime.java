package codetalksdna.CodingPrograms;
import java.time.LocalDateTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime Present = LocalDateTime.now();
        System.out.println("The current date and time are : " + Present);
    }
}
