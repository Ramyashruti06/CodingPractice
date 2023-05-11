package codetalksdna.CodingPrograms;

import java.io.File;

public class CountOfFilesInCodingPrograms {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\CodingPrograms\\");
        return file.listFiles().length;
    }
}
