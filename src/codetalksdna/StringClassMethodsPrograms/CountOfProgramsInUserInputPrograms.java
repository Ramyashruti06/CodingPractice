package codetalksdna.StringClassMethodsPrograms;

import java.io.File;

public class CountOfProgramsInUserInputPrograms {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\StringClassMethodsPrograms\\");
        return file.listFiles().length;
    }
}
