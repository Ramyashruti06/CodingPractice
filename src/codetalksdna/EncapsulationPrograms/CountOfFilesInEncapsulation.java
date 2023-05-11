package codetalksdna.EncapsulationPrograms;

import java.io.File;

public class CountOfFilesInEncapsulation {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\EncapsulationPrograms\\");
        return file.listFiles().length;
    }
}
