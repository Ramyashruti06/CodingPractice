package codetalksdna.ArraysPrograms.OneDArrays;

import java.io.File;

public class CountOfFilesIn1DArray {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\ArraysPrograms\\OneDArrays\\");
        return file.listFiles().length;
    }
}
