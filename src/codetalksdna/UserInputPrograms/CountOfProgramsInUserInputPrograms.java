package codetalksdna.UserInputPrograms;

import java.io.File;

public class CountOfProgramsInUserInputPrograms {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\UserInputPrograms\\");
        return file.listFiles().length;
    }
}
