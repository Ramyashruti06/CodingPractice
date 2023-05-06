package codetalksdna.CodingPrograms;

import java.io.File;
import java.util.Objects;

public class CountNoOfPrograms {
    public static void main(String[] args) {

        File directory = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\CodingPrograms\\");
        if (directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null && files.length > 0) {
                System.out.println(Objects.requireNonNull(directory.listFiles()).length);
            }
        }
    }
}
