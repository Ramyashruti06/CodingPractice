package codetalksdna.ExceptionClassPrograms;

import java.io.File;

public class CountOfFilesInExceptionClass {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\ExceptionClassPrograms\\");
        return file.listFiles().length;
    }
}
