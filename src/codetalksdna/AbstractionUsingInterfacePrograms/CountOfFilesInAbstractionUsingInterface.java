package codetalksdna.AbstractionUsingInterfacePrograms;

import java.io.File;

public class CountOfFilesInAbstractionUsingInterface {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\AbstractionUsingInterfacePrograms\\");
        return file.listFiles().length;
    }
}
