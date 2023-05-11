package codetalksdna.ConstructorPrograms;

import java.io.File;

public class CountOfFilesInConstructor {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\ConstructorPrograms\\");
        return file.listFiles().length;
    }
}
