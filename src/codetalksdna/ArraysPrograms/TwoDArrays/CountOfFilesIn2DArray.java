package codetalksdna.ArraysPrograms.TwoDArrays;

import java.io.File;

public class CountOfFilesIn2DArray {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\ArraysPrograms\\TwoDArrays");
        return file.listFiles().length;
    }
}
